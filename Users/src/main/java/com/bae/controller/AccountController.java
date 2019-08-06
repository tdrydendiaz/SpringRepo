package com.bae.controller;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.entity.Account;
import com.bae.service.AccountService;
import com.bae.service.AccountServiceImpl;


@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService service;
	
	@GetMapping("/all")
	public Collection<Account> getAllAccounts() {
		return service.getAllAccounts();
	}

	@GetMapping("/anAccount/{id}")
	public Collection<Account> getanAccount(@PathParam("id") int id) {
		return AccountServiceImpl.getAnAccount();
	}
//
//	@DeleteMapping("/delete/{id}")
//	public Collection<Account> deleteAccount(@PathParam("id") int id) {
//		return AccountServiceImpl.deleteAccount();
//	}
//
//	@PutMapping("updateAccount/{id}")
//	public Collection<Account> updateAccount(@PathVariable("id") int id, String accountNumber) {
//
//		return AccountServiceImpl.updateAccount(id, accountNumber);
//	}
//
//	@PostMapping("/create")
//	public Collection<Account> createAccount() {
//		return AccountServiceImpl.createAccount();
//	}

}
