package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSimpleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(FirstSimpleApplication.class, args);
		shop s=con.getBean("rajashop",shop.class);
		System.out.println(s.sellShoe());
	}

}
