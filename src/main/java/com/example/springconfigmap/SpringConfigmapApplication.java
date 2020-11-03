package com.example.springconfigmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringConfigmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigmapApplication.class, args);
	}

}
