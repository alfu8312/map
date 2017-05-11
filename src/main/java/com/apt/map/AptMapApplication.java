package com.apt.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/local.context.properties")
public class AptMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(AptMapApplication.class, args);
	}
}
