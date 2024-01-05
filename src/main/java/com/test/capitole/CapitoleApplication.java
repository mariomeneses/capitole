package com.test.capitole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.test.capitole")
public class CapitoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapitoleApplication.class, args);
	}

}
