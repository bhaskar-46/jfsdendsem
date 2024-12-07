package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldProjectApplication.class, args);
		System.out.println("hi this is my first spring boot project.........!");
	}

}
