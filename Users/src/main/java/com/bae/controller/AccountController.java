package com.bae.controller;

import java.util.Collection;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bae.entity.Account;
import com.bae.entity.SentAccount;
import com.bae.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService service;
	private JmsTemplate jmsTemplate;

	public AccountController() {

	}

	@Autowired
	public AccountController(AccountService service, JmsTemplate jmsTemplate) {
		this.service = service;
		this.jmsTemplate = jmsTemplate;
	}


	@PostMapping
	private Account sendToQueue(Account account) {
		SentAccount sentAccount = new SentAccount(account);
		jmsTemplate.convertAndSend("AccountQueue", sentAccount);
		return account;
	}

	@GetMapping("/all")
	public Collection<Account> getAllAccounts() {
		return service.getAllAccounts();
	}

	@GetMapping("/anAccount/{id}")
	public Account getanAccount(@PathVariable("id") Long id) {
		return service.getanAccount(id);
	}

	@PostMapping("/createAcc")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) {
		Account NewAcc = service.createAccount(account);
		sendToQueue(account);
		return new ResponseEntity<>(NewAcc, HttpStatus.CREATED);
		
	}

	@DeleteMapping("/delete/{id}")
	public String deleteAccount(Account account) {
		return service.deleteAccount(account);
	}

	@PutMapping("updateAccount/{id}")
	public String updateAccount(Account account) {
		return service.updateAccount(account);

	}
//	@GetMapping("/getMicro")
//	public String getMicro() {
//
//		ResponseEntity<String> exchangeAccount = restTemplate.exchange("http://localhost:8081/getMicro",
//				HttpMethod.GET, null, String.class);
//		return exchangeAccount.getBody();
//
//	}
}
