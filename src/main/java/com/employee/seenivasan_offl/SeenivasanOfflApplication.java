package com.employee.seenivasan_offl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching  // Enable caching
public class SeenivasanOfflApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeenivasanOfflApplication.class, args);
	}
}
