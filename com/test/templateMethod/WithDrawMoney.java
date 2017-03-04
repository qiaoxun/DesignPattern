package com.test.templateMethod;

public class WithDrawMoney extends BankTemplate {

	@Override
	public void transact() {
		System.out.println("I want my 1000 US dollars");
	}

}
