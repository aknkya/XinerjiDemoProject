package com.example.demo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;

@Configuration
public class Beans {
    @Bean
    public HttpClient getHttpClient() {
        return HttpClient.newBuilder().build();
    }
}
