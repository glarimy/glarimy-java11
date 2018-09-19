package com.glarimy.bank.api;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface Bank {
	static List<Bank> getInstances() {
		ServiceLoader<Bank> services = ServiceLoader.load(Bank.class);
		List<Bank> list = new ArrayList<>();
		services.iterator().forEachRemaining(list::add);
		return list;
	}

	public int openAccount(String customer);
}
