package com.test.templateMethod;

public class Client {
	public static void main(String[] args) {
		BankTemplate withdrawMoney = new WithDrawMoney();
		withdrawMoney.process();
	}
}
