package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.entity.Account;
import com.bae.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	
	private AccountRepo repo;
	
	public AccountServiceImpl() {
		
	}
	
	
	@Autowired
	public AccountServiceImpl(AccountRepo accountRepo) {
		this.repo=accountRepo;
	}
	@Autowired
	private RestTemplate rest;


	@Override
	public Collection<Account> getAllAccounts() {
		return repo.findAll();
		
	}
	
	@Override
	public Account getanAccount(long id) {
		Account oneAcc = repo.findById(id).get();
				return oneAcc;
	}
	

	@Override
	public Account createAccount(Account account) {
		
		return repo.save(account);
	}

	
	@Override
	public String updateAccount(Account account) {
	repo.deleteById(account.getId());
	repo.save(account);
	return account.toString();
	}

	@Override
	public String deleteAccount(Account account) {
		repo.delete(account);
		return "Account deleted";
	}


	

	

}
