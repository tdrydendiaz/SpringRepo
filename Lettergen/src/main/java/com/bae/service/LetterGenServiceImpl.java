package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class LetterGenServiceImpl implements LetterGenService {

	@Override
	public String getLetter() {

		int num = (int) (Math.random() * 3);

		switch (num) {
		case 0:
			return "a";
		case 1:
			return "b";
		case 2:
			return "c";
		}

		return "";
	}

}
