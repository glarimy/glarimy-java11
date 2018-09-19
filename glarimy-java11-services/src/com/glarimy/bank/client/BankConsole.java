package com.glarimy.bank.client;

import com.glarimy.bank.api.Bank;

public class BankConsole {

	public static void main(String[] args) {
		int num = Bank.getInstances().get(0).openAccount("Krishna");
		System.out.println("Account opened with no: " + num);
	}

}