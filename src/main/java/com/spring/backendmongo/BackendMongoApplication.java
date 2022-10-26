package com.spring.backendmongo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.spring.backendmongo.repositories")
@SpringBootApplication
public class BackendMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendMongoApplication.class, args);
	}
}