package com.cloudcom2024.store;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cloudcom2024.store.models.Basket;
import com.cloudcom2024.store.models.Item;
import com.cloudcom2024.store.models.Task;
import com.cloudcom2024.store.models.TaskDetail;
import com.cloudcom2024.store.models.User;
import com.cloudcom2024.store.repositories.BasketRepository;
import com.cloudcom2024.store.repositories.ItemRespository;
import com.cloudcom2024.store.repositories.TaskDetailsRepository;
import com.cloudcom2024.store.repositories.TaskRepository;
import com.cloudcom2024.store.repositories.UserRepository;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class DatabaseLoader implements CommandLineRunner{
    final private ItemRespository itemRespository;
    final private TaskRepository taskRepository;
    final private TaskDetailsRepository taskDetailsRepository;
    final private UserRepository userRepository;
    final private BasketRepository basketRepository;
    final private PasswordEncoder passwordEncoder;

    public DatabaseLoader(
        ItemRespository itemRespository,
        TaskRepository taskRepository,
        TaskDetailsRepository taskDetailsRepository,
        UserRepository userRepository,
        BasketRepository basketRepository,
        PasswordEncoder passwordEncoder
    ) {
        this.itemRespository = itemRespository;
        this.taskRepository = taskRepository;
        this.taskDetailsRepository = taskDetailsRepository;
        this.userRepository = userRepository;
        this.basketRepository = basketRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... strings) throws Exception {
        Basket basket = new Basket();
        basket.setTotalPrice(new BigDecimal("204.4"));

        Item item1 = new Item();
        item1.setName("Футболка");
        item1.setPrice(new BigDecimal("102.2"));
        item1.setCategory("Одежда");
        item1.setBasket(basket);

        Item item2 = new Item();
        item2.setName("Шампунь джумай сынба");
        item2.setPrice(new BigDecimal("102.2"));
        item2.setCategory("Средства гигиены");
        item2.setBasket(basket);

        itemRespository.save(item1);
        itemRespository.save(item2);

        User user = new User();
        user.setUsername("user");
        user.setFirstName("dima");
        user.setLastName("zakovalov");
        user.setPassword(passwordEncoder.encode("user"));
        user.setCoinBalance(new BigDecimal("100"));
        user.setRoles("ROLE_USER");
        user.setTaskDetail(null);

        User admin = new User();
        admin.setUsername("admin");
        admin.setFirstName("dima");
        admin.setLastName("zakovalov");
        admin.setPassword(passwordEncoder.encode("admin"));
        admin.setCoinBalance(new BigDecimal("100"));
        admin.setRoles("ROLE_ADMIN");
        admin.setTaskDetail(null);

        userRepository.save(user);
        userRepository.save(admin);

        Task task = new Task();
        task.setTitle("Поешь в столовой");
        task.setCoinReward(new BigDecimal("102.2"));

        taskRepository.save(task);

        TaskDetail taskDetail = new TaskDetail();
        taskDetail.setTaskDeadline(LocalDateTime.now());
        taskDetail.setTimeCompletion(LocalDateTime.now());
        taskDetail.setDone(false);
        taskDetail.setUser(user);
        taskDetail.setTask(task);

        taskDetailsRepository.save(taskDetail);
    }
    
}
