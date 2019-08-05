package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.bae.entity.Account;
import com.bae.repository.AccountRepo;

public class AccountServiceImpl implements AccountService {

	
	@Autowired
	private AccountRepo repo;
	
	
	
	public static Collection<Account> getAllAccounts() {
	
		return null;
	}


	public static Collection<Account> createAccount() {
	
		return null;
	}

	public static Collection<Account> deleteAccount() {
	
		return null;
	}

	public static Collection<Account> getAnAccount() {
	
		return null;
	}

	public static Collection<Account> updateAccount(int id, String accountNumber) {
		
		return null;
	}
}


	