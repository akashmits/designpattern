package com.springboot.interview.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		System.out.println("project started");
		SpringApplication.run(BasicApplication.class, args);
	}

}
