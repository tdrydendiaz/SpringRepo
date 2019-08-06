package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

	@Override
	public Integer getNumber6() {
		return (int)(Math.random()*6);

	}

	@Override
	public Integer getNumber8() {
		return (int)(Math.random()*8);
	}

	@Override
	public Integer getNumber10() {
		return (int)(Math.random()*10);
	}



}
