package com.cafe24.mysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class BootApp extends SpringBootServletInitializer {
public class BootApp {

	public static void main(String[] args) {
		SpringApplication.run(BootApp.class, args);
	}
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(BootApp.class);
//	}
}
