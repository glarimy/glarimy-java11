package com.glarimy.bank.service;

import com.glarimy.bank.api.Bank;
import com.glarimy.bank.data.AccountRepository;

public class MyBank implements Bank {

	@Override
	public int openAccount(String customerName) {
		System.out.println("Opening a/c for " + customerName);
		return AccountRepository.getInstances().get(0).save(customerName);
	}

}
