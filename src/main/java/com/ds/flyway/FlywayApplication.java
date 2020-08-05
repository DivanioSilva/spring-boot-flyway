package com.ds.flyway;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class FlywayApplication implements CommandLineRunner {

	//@Autowired
	//private UserRepository userRepository;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).baselineOnMigrate(true).load().migrate();

/*		User user = new UserBuild.Builder().userName("MariannoLib").email("mariano@gmail.com").firstName("Marianno")
				.lastName("Liberati").build().getUser();

		User user1 = this.userRepository.save(user);

		System.out.println();*/
	}
}
