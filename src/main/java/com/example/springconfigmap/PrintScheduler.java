package com.example.springconfigmap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PrintScheduler {

    @Autowired
    private WelcomeConfiguration configuration;

    @Scheduled(fixedDelay = 3_000)
    public void print(){
        System.out.println(configuration.getMessage());
    }
}
