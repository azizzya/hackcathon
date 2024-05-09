package com.cloudcom2024.store.configs;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.cloudcom2024.store.proxies")
public class ProjectConfig {
    
}
