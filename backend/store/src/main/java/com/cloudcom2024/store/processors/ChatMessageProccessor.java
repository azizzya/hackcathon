package com.cloudcom2024.store.processors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.cloudcom2024.store.daos.AccessTokenDAO;
import com.cloudcom2024.store.daos.MessageDAO;
import com.cloudcom2024.store.daos.MessageResponseDAO;
import com.cloudcom2024.store.daos.MessageWithParammetersDAO;
import com.cloudcom2024.store.dtos.ChatMessageRequest;
import com.cloudcom2024.store.dtos.GigaChatAccessTockenResponse;
import com.cloudcom2024.store.models.Message;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.proxies.GigaChatGetTokenProxy;
import com.cloudcom2024.store.proxies.GigaChatMessageProxy;
import com.cloudcom2024.store.repositories.MessageRepository;
import com.cloudcom2024.store.repositories.UserRepository;

import lombok.extern.log4j.Log4j2;

@Component
@SessionScope
@Log4j2
public class ChatMessageProccessor {
    private GigaChatAccessTockenResponse currentToken;
    @Value("${gigachat.authtoken}")
    private String authToken;

    final private GigaChatGetTokenProxy gigaChatGetTokenProxy;
    final private GigaChatMessageProxy gigaChatMessageProxy;
    final private UserRepository userRepository;
    final private MessageRepository messageRepository;

    public ChatMessageProccessor(
        GigaChatGetTokenProxy gigaChatGetTokenProxy,
        GigaChatMessageProxy gigaChatMessageProxy,
        UserRepository userRepository,
        MessageRepository messageRepository    
    ) {
        this.gigaChatGetTokenProxy = gigaChatGetTokenProxy;
        this.gigaChatMessageProxy = gigaChatMessageProxy;
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
    }

    public void setToken(GigaChatAccessTockenResponse newToken) {
        currentToken = newToken;
    }

    public GigaChatAccessTockenResponse getCurrentToken() {
        return currentToken;
    }

    public void updateToken() {
        String rqUID = UUID.randomUUID().toString();
        Map<String, Object> headers = new HashMap<>();
        headers.put("RqUID", rqUID);
        log.info(authToken);
        headers.put("Authorization", "Basic " + authToken);
        AccessTokenDAO scope = new AccessTokenDAO();
        scope.setScope("GIGACHAT_API_PERS");

        currentToken = gigaChatGetTokenProxy.createAccessTocken(
            headers,
            scope
        );
    }

    public String getMessage(ChatMessageRequest chatMessageRequest) {
        Map<String, Object> headers = new HashMap<>();
        String authorizationCredentials = String.format("Bearer %s", currentToken.getAccessToken());
        headers.put("Authorization", authorizationCredentials);

        String username = chatMessageRequest.getUsername();
        List<Message> userPreviousMessages = userRepository
            .findUserByUsername(username).get()
            .getMessages();
        User user = userRepository.findUserByUsername(username).get();

        List<MessageDAO> messages = userPreviousMessages.stream()
            .map(x -> x.convertDAOMessage()) 
            .collect(Collectors.toList());

        MessageDAO newMessage = chatMessageRequest.convertToMessageDAO();
        messages.add(newMessage);
        Message message = newMessage.convertToMessage();
        message.setUser(user);
        messageRepository.save(message);
        
        MessageWithParammetersDAO messageWithParammeters = new MessageWithParammetersDAO();
        messageWithParammeters.setTemperature(1f);
        messageWithParammeters.setN(1);
        messageWithParammeters.setMessages(messages);

        MessageResponseDAO messageResponse = gigaChatMessageProxy.sendMessage(headers, messageWithParammeters);
        
        int lastIndex = messageResponse.getChoices().size() - 1;

        //return messageResponse.getChoices().get(lastIndex)
            //.getMessage()
            //.getContent();
        return null;
    }
}