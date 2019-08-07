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
	
	private RestTemplate rest;

	@Autowired
	public AccountServiceImpl(AccountRepo accountRepo, RestTemplate rest) {
		this.repo = accountRepo;
		this.rest = rest;
	}
	
	public AccountServiceImpl() {

	}


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

		String prefix = rest.getForObject("http://localhost:8083/Letter", String.class);
		
		String suffix = rest.getForObject("http://localhost:8082/getNum6", String.class);

		String accountNumber = prefix + suffix;
		
		account.setAccountNumber(accountNumber);
		
		String prize = rest.getForObject("http://localhost:8084/"+accountNumber, String.class);
		
		account.setPrize(prize);
		
		System.out.println(prize);
		System.out.println(account);
		System.out.println(account.getPrize());

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
