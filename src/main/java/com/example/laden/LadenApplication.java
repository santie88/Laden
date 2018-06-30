package com.example.laden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.laden.repository")
public class LadenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LadenApplication.class, args);
	}
}
