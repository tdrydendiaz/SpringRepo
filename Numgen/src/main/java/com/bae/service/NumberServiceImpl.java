package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

	@Override
	public Integer getNumber6() {
		return (int)(Math.random()*100000);

	}

	@Override
	public Integer getNumber8() {
		return (int)(Math.random()*1000000);
	}

	@Override
	public Integer getNumber10() {
		return (int)(Math.random()*10000000);
	}



}
