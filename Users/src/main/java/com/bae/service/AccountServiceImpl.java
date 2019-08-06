package com.bae.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.entity.Account;
import com.bae.repository.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo repo;

	public Collection<Account> getAllAccounts() {
		return repo.findAll();
	}

	
	public Account getanAccount(long id) {
		return repo.findById(id);
	}
//	public static Collection<Account> createAccount() {
//		return null;
//
//	}
//
//	public static Collection<Account> deleteAccount() {
//
//		return null;
//	}
//

//
//	public static Collection<Account> updateAccount(int id, String accountNumber) {
//
//		return repo.updateAccount(id, accountNumber);
//	}

//	@Override
//	public String getAllAccounts() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getanAccount(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String createAccount(String accountNumber) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String updateAccount(int id, String accountNumber) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteAccount(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
}
