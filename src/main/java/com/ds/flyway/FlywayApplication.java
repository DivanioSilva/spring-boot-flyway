package com.ds.flyway;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
