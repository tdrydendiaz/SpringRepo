package com.bae.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.entity.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

	

	
}
