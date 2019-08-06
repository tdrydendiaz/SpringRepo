package com.bae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.Account;
@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

	

	
}
