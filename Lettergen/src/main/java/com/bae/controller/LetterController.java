package com.bae.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import com.bae.service.LetterGenService;

@RestController
@RequestMapping("/getLetter")
public class LetterController {

	@Autowired
	public LetterGenService service;

	
	public String getLetter() {

		return service.getLetter();
	}
}
