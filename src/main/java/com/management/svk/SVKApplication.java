package com.management.svk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SVKApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SVKApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SVKApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("http://localhost:7070","http://localhost:4200")
				.allowedHeaders("Access-Control-Allow-Origin","*")
				.allowedHeaders("Access-Control-Allow-Methods","*")
				.allowedHeaders("Access-Control-Allow-Headers","*")
	            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
	            .maxAge(3600L);
			}
		};
	}

}
