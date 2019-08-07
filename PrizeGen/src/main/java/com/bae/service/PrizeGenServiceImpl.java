package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenServiceImpl implements PrizeGenService {
	@Override
	public String getPrize(String accountNumber) {
		
		String result = "";

		switch (accountNumber.charAt(0)) {
		case 'a': {
			if (accountNumber.length() == 6) {
				result = "You Won $0";
			}

			if (accountNumber.length() == 8) {
				result = "You Won $0";
			}
			if (accountNumber.length() == 10) {
				result = "You Won $0";
			}
		}

		case 'b': {
			if (accountNumber.length() == 6) {
				result = "You Won $50";
			}

			if (accountNumber.length() == 8) {
				result = "You Won $500";
			}
			if (accountNumber.length() == 10) {
				result = "You Won $5000";
			}
		}

		case 'c': {
			if (accountNumber.length() == 6) {
				result = "You Won $100";
			}

			if (accountNumber.length() == 8) {
				result = "You Won $750";
			}
			if (accountNumber.length() == 10) {
				result = "You Won $10000";
			}
		}
			
		}
		System.out.println(result);
		return result;
	}

}
