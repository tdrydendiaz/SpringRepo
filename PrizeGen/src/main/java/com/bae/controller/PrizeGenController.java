package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.PrizeGenService;

@RestController
public class PrizeGenController {
	
	@Autowired
	public PrizeGenService service;
	
	@RequestMapping("/{accountNumber}")
	public String getNumber(@PathVariable String accountNumber) {
		return service.getPrize(accountNumber);
	}
	
	

}
