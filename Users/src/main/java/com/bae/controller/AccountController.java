package com.bae.controller;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	

	@DeleteMapping("/delete/{id}")
	public Collection<Account> deleteAccount(@PathParam("id") int id) {
			return AccountService.deleteAccount();
		}
	
//	
//	@PutMapping("/{id}")
//	public Collection<Account> updateAccount(@PathVariable("id") int id, String accountNumber)
//	Account.setAccountNumber(id);
//	return AccountService.updateAccount(account);
	
@PostMapping("/create")
public Collection<Account> createAccount(){
	return AccountService.createAccount();
}

	
	
}
