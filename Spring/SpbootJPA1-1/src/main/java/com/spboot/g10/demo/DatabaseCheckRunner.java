package com.spboot.g10.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCheckRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Bean
    public ApplicationRunner checkDatabaseConnection() {
        return args -> {
            try {
                jdbcTemplate.execute("SELECT 1 FROM dual");
                System.out.println("Successfully connected to the Oracle database.");
            } catch (Exception e) {
                System.err.println("Failed to connect to the Oracle database.");
                e.printStackTrace();
            }
        };
    }
}
