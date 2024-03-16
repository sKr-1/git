package com.x.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		System.out.println("random");
		SpringApplication.run(GitApplication.class, args);
	}

}
