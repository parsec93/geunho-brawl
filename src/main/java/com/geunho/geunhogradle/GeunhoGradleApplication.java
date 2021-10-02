package com.geunho.geunhogradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GeunhoGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeunhoGradleApplication.class, args);
	}

}