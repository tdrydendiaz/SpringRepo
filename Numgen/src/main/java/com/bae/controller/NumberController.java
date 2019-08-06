package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.service.NumberService;

@RestController
public class NumberController {
@Autowired
public NumberService service;

@RequestMapping("/getNum6")
public Integer getNumber() {
	return service.getNumber6();
}
	
	
@RequestMapping("/getNum8")
public Integer getNumber8() {
	return service.getNumber8();
}

@RequestMapping("/getNum10")
public Integer getNumber10() {
	return service.getNumber10();
}
}
