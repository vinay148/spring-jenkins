package com.mindtree.springjenkins;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


  

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	
	@PostConstruct
	public void init() {
		logger.info("application started");
	}
	

	public static void main(String[] args) {
		logger.info("application executedddddddddddd...");
		logger.info("application executed second...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}



