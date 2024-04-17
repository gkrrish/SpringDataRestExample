package com.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestExampleApplication.class, args);
		
		System.out.println("http://localhost:8289/swagger-ui/index.html");
	}

}
