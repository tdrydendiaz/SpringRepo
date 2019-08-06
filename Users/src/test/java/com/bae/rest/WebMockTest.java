package com.bae.rest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.bae.controller.AccountController;
import com.bae.entity.Account;
import com.bae.service.AccountService;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountController.class)
@AutoConfigureMockMvc
public class WebMockTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private AccountService service;

	@MockBean
	private RestTemplate restTemplate;

	private static final Account MOCK_ACC_1 = new Account("AC123456", "Tania", "Diaz", 30);
	private static final Account MOCK_ACC_2 = new Account("AD123456", "Jen", "Smith", 60);

	@Test
	public void getAllTest() throws Exception {

	Collection<Account> MOCK_ACC = new ArrayList<>();
		MOCK_ACC.add(MOCK_ACC_1);
		MOCK_ACC.add(MOCK_ACC_2);

		when(service.getAllAccounts()).thenReturn(MOCK_ACC);

		mockMvc.perform(get("/getAllAccounts")).andExpect(content().string(containsString("Tania")));
	}

}
