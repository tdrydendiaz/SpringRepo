package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class MicroController {
	private RestTemplate restTemplate;

	public MicroController(@Autowired RestTemplate restTemplate) {
	this.restTemplate = restTemplate;
	}

}
