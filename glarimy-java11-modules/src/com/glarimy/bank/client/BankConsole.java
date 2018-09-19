package com.glarimy.bank.client;

import com.glarimy.bank.api.Bank;
import com.glarimy.bank.service.MyBank;

public class BankConsole {

	public static void main(String[] args) {
		Bank bank = new MyBank();
		int num = bank.openAccount("Krishna");
		System.out.println("Account opened with no: " + num);
	}

}