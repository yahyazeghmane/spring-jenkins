package com.snim.jenkins2;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins2Application {
	private static Logger logger = LoggerFactory.getLogger(Jenkins2Application.class);
	@PostConstruct
	public void init(){
		logger.info("Application is stared...");
	}
	public static void main(String[] args) {
		logger.info("Application is executed...");
		SpringApplication.run(Jenkins2Application.class, args);
	}

}
