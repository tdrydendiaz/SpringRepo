package com.bae.rest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.mapping.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.bae.controller.AccountController;
import com.bae.entity.Account;
import com.bae.service.AccountService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)



public class MockitoTest {
	
@InjectMocks
AccountController controller;

@Mock
AccountService service;

private static final Account MOCK_ACC_1= new Account("AC123456", "Tania","Diaz", "30");
private static final Account MOCK_ACC_2= new Account ("AD123456", "Jen", "Smith", "60");
private static final String MOCK_DELETE_RESPONSE = "Account Successfully deleted";

@Test 
public void getAccountsTest() {
Collection<Account> MOCK_ACC = new ArrayList<>();
MOCK_ACC.add(MOCK_ACC_1);
MOCK_ACC.add(MOCK_ACC_2);

Mockito.when(service.getAllAccounts()).thenReturn(MOCK_ACC);
assertEquals(MOCK_ACC,controller.getAllAccounts());
Mockito.verify(service).getAllAccounts();

}

@Test
public void getAnAccountTest() {
	
}

@Test
public void deleteAccountTest() {
	Mockito.when(service.deleteAccount(MOCK_ACC_1)).thenReturn(MOCK_DELETE_RESPONSE);
	assertEquals(MOCK_DELETE_RESPONSE, controller.deleteAccount(MOCK_ACC_1));
	Mockito.verify(service).deleteAccount(MOCK_ACC_1);
}



@Test
public void updateAccountTest() {
	Mockito.when(service.updateAccount(MOCK_ACC_1)).thenReturn(MOCK_ACC_1.toString());

	assertEquals(MOCK_ACC_1.toString(), controller.updateAccount(MOCK_ACC_1));
	Mockito.verify(service).updateAccount(MOCK_ACC_1);
}

@Test
public void createAccountTest() {

	Mockito.when(service.createAccount(MOCK_ACC_1)).thenReturn(MOCK_ACC_1);

	assertEquals(MOCK_ACC_1, controller.createAccount(MOCK_ACC_1).getBody());
	Mockito.verify(service).createAccount(MOCK_ACC_1);
}


}
