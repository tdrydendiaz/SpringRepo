package com.bae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.entity.SentAccount;

@Repository
public interface MongoAccountRepository extends MongoRepository<SentAccount, Long> {

}