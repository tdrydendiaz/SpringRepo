package com.bae.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.entity.Account;
import com.bae.repository.AccountRepo;

@RunWith(SpringRunner.class)
public class MockitoTest {

	@InjectMocks
	AccountServiceImpl service;
	@Mock
	AccountRepo repo;

	private static final Account MOCK_ACC_1 = new Account("AC123456", "Tania", "Diaz", 30);
	private static final Account MOCK_ACC_2 = new Account("AD123456", "Jen", "Smith", 60);
	private static final String MOCK_DELETE_RESPONSE = "Account Successfully deleted";

	@Test
	public void getAccountsTest() {
		List<Account> MOCK_ACC = new ArrayList<>();
		MOCK_ACC.add(MOCK_ACC_1);
		MOCK_ACC.add(MOCK_ACC_2);
		Mockito.when(repo.findAll()).thenReturn(MOCK_ACC);
		assertEquals(MOCK_ACC, service.getAllAccounts());
		Mockito.verify(repo).findAll();

	}

}
