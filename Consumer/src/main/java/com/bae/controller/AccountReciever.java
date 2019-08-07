package com.bae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.entity.SentAccount;
import com.bae.repository.MongoAccountRepository;

@Component
public class AccountReciever {

	private MongoAccountRepository repo;

	@Autowired
	public AccountReciever(MongoAccountRepository repo) {
		this.repo = repo;
	}

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(SentAccount sentAccount) {
		repo.save(sentAccount);
	}
}