package com.example.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EmsApplication.class);
		app.setAdditionalProfiles("h2"); // or "mysql"
		app.run(args);
	}



}
