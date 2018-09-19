package com.glarimy.bank.data;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface AccountRepository {
	static List<AccountRepository> getInstances() {
		ServiceLoader<AccountRepository> services = ServiceLoader.load(AccountRepository.class);
		List<AccountRepository> list = new ArrayList<>();
		services.iterator().forEachRemaining(list::add);
		return list;
	}

	public int save(String customerName);
}
