package com.glarimy.bank.service;

import com.glarimy.bank.api.Bank;
import com.glarimy.bank.data.AccountRepository;
import com.glarimy.bank.data.InMemoryRepository;

public class MyBank implements Bank {

	@Override
	public int openAccount(String customerName) {
		System.out.println("Opening a/c for " + customerName);
		AccountRepository repo = new InMemoryRepository();
		return repo.save(customerName);
	}

}
