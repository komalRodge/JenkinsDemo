package com.jenkinsexample;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsDemoApplication {
	
	public static Logger logger =(Logger) LoggerFactory.getLogger(JenkinsDemoApplication.class);
	
	@PostConstruct
	public void init(String msg)
	{
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		logger.info("Application executed");

		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
