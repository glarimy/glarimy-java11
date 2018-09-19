package com.glarimy.bank.data;

import java.util.Random;

public class InMemoryRepository implements AccountRepository {
	public int save(String customerName) {
		System.out.println("Saving a/c info for " + customerName);
		return new Random().nextInt();
	}
}
