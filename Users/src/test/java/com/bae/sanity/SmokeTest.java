package com.bae.sanity;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.controller.AccountController;

@RunWith(SpringRunner.class)
@SpringBootTest


public class SmokeTest {
	
	@Autowired
	private AccountController controller;
	
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	
}
