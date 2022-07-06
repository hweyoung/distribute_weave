package com.weave.weaveserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WeaveServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeaveServerApplication.class, args);
	}

}
