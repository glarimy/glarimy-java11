module com.glarimy.bank.data { 
	exports com.glarimy.bank.data;
	uses com.glarimy.bank.data.AccountRepository;
	provides com.glarimy.bank.data.AccountRepository with com.glarimy.bank.data.InMemoryRepository;
}