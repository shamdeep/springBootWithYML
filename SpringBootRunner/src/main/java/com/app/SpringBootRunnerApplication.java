package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunnerApplication.class, args);
		System.out.println(" This is Spring boot Application");
	}

}
