package com.cjc.SpringBoot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		System.out.println("This is spring boot page");
		SpringApplication.run(SpringBoot2Application.class, args);
	}

}
