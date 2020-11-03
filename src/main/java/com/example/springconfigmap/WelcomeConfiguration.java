package com.example.springconfigmap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
public class WelcomeConfiguration {
    private String message = "Welcome from code";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
