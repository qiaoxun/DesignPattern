package com.test.strategy;

public class StategyContext {
	private CustomStategy stategy;

	public StategyContext(CustomStategy stategy) {
		super();
		this.stategy = stategy;
	}
	
	public double getPrice(double originPrice){
		
		return stategy.getPrice(originPrice);
	}
	
	
}
