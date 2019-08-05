package com.bae.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class testRest {


	
			@Bean
			public String rest() {
		return "This is another Component!";

		}

	}


