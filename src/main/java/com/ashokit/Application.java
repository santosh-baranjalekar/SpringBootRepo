package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		System.out.println("Application Context");
		//changes done for Task-2
		System.out.println("Changes Done for Task-2");
		//changes done for Task-4
		System.out.println("Changes Done for Task-4");
	}

}
