package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
public class MyComponent {
	
	@Bean
	public String comp() {
	return "This is a component!";

	}

}
