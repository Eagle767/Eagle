package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import comppack.ComponentTest;

@SpringBootApplication
@ComponentScan(basePackages = {"comppack","daopack","servicepack"})
public class SecondDayApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= SpringApplication.run(SecondDayApplication.class, args);
		ComponentTest ct=con.getBean("muthu",ComponentTest.class);
		ct.comp();
	}

}
