package com.spring_hibernate_jpa.spring_hibernate_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Hello World!");
		};
	}

}
