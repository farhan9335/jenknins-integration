package com.example.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkninsIntegrationApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkninsIntegrationApplication.class);

	public static void main(String[] args) {
		logger.info("Started main method executing....");
		SpringApplication.run(JenkninsIntegrationApplication.class, args);
		logger.info("Ended main method execution....");
	}
	
	public void taskExecutedBeforRunApplication() {
		logger.info("Run before appliation started...");
	}

}
