package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot3LogLogbackApplication {

	private static final Logger log = LoggerFactory.getLogger(Springboot3LogLogbackApplication.class);

	public static void main(String[] args) {
		log.info("Starting...");
		SpringApplication.run(Springboot3LogLogbackApplication.class, args);
		log.info("My message set at info level");

		log.warn("warn");
		log.debug("debug");
		log.trace("trace");
		log.error("error");
	}

}
