package com.bae.service;

import java.util.Collection;

import com.bae.entity.Account;

public interface AccountService {
	Collection<Account> getAllAccounts();
	Account getanAccount(long id);
//	String createAccount(String accountNumber);
//	String updateAccount(int id, String accountNumber);
//	String deleteAccount(int id);
	
	
}
