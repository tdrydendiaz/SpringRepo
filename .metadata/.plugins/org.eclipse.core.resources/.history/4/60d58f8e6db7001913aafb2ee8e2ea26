package com.bae;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfiguration {
	
 @Bean
	public String helloWorld() {
		return "Hello World";
		
	}

@Bean
@Scope("prototype")
public LocalTime time() {
	return LocalTime.now();
}
}
