package com.bae.service;

public interface AccountService {
	String getAllAccounts();
	String getanAccount(int id);
	String createAccount(String accountNumber);
	String updateAccount(int id, String accountNumber);
	String deleteAccount(int id);
	
	
}
