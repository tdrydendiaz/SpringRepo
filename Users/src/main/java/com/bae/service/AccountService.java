package com.bae.service;

import java.util.Collection;

import com.bae.entity.Account;

public interface AccountService {
	Collection<Account> getAllAccounts();
	Account getanAccount(long id);
	Account createAccount(Account account);
	String updateAccount(Account account);
	String deleteAccount(Account account);
	
}

