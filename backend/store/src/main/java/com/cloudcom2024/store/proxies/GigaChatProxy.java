package com.cloudcom2024.store.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cloudcom2024.store.dtos.GigaChatAccessTockenResponse;

@FeignClient(
    name = "gigaChat",
    url = "https://ngw.devices.sberbank.ru:9443/api/v2/oauth"
)
public interface GigaChatProxy {
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public GigaChatAccessTockenResponse createAccessTocken(
        @RequestHeader(value = "Content-Type") String contentType,
        @RequestHeader(value = "Accept") String accept,
        @RequestHeader(value = "RqUID") String rqUID,
        @RequestHeader(value = "Authorization") String authorizationBasic,
        @RequestBody String scope
    );
} 