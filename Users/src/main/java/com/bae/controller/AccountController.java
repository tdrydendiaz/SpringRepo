package com.bae.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Account;
import com.bae.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@GetMapping
	public Collection<Account> getAllAccounts(){
		return AccountService.getAllAccounts();
	}

	
	
	
}
