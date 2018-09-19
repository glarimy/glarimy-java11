open module com.glarimy.bank.service { 
	requires com.glarimy.bank.api;
	requires com.glarimy.bank.data;
	provides com.glarimy.bank.api.Bank with com.glarimy.bank.service.MyBank;
}