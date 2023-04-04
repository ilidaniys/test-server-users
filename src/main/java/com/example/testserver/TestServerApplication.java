package com.example.testserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestServerApplication {
	private static final Logger log = LoggerFactory.getLogger(TestServerApplication.class);
	public static void main(String[] args) {
		log.info("Start main...");
		SpringApplication.run(TestServerApplication.class, args);
		log.info("Finish main...");
	}

}
