package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"controlpack"})
@SpringBootApplication
public class SecondDayWebControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondDayWebControllerApplication.class, args);
	}

}
