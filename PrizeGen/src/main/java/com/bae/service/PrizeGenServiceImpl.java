package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenServiceImpl implements PrizeGenService {
	@Override
	public String getPrize(String accountNumber) {

		switch (accountNumber.charAt(0)) {
		case 'a': {
			if (accountNumber.length() == 6) {
				return "You Won $0";
			}

			if (accountNumber.length() == 8) {
				return "You Won $0";
			}
			if (accountNumber.length() == 10) {
				return "You Won $0";
			}
		}

		case 'b': {
			if (accountNumber.length() == 6) {
				return "You Won $50";
			}

			if (accountNumber.length() == 8) {
				return "You Won $500";
			}
			if (accountNumber.length() == 10) {
				return "You Won $5000";
			}
		}

		case 'c': {
			if (accountNumber.length() == 6) {
				return "You Won $100";
			}

			if (accountNumber.length() == 8) {
				return "You Won $750";
			}
			if (accountNumber.length() == 10) {
				return "You Won $10000";
			}
		}
			
		}
		return "";
	}

}
