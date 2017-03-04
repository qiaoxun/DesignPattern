package com.test.strategy;

public class Client {
	public static void main(String[] args) {
		CustomStategy stategy = new NewCustomFew();
		StategyContext context = new StategyContext(stategy);
		System.out.println(context.getPrice(100));
	}
}
