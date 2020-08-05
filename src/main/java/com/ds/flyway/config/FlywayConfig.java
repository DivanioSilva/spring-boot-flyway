package com.ds.flyway.config;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class FlywayConfig {

  //  @Bean
    public FlywayMigrationInitializer flywayMigrationInitializer(Flyway flyway){
        return new FlywayMigrationInitializer(flyway, (f) -> {});
    }
}
