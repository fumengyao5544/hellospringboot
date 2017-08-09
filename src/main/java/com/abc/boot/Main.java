package com.abc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.abc")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Main.class, args);
	}

}
