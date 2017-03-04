package com.test.templateMethod;

public abstract class BankTemplate {
	/**
	 * first step
	 */
	public void takeNumber(){
		System.out.println("take number");
	}
	
	/**
	 * second step
	 */
	public abstract void transact();
	
	/**
	 * last step
	 */
	public void evaluate(){
		System.out.println("final step evaluate");
	}
	
	/**
	 * process
	 */
	public void process(){
		takeNumber();
		transact();
		evaluate();
	}
	
}
