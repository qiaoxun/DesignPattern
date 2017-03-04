package com.test.factory.simpleFactory;

public class CLient {
	public static void main(String[] args) {
		//get audi
		Audi audi = (Audi) CarFactory.createCar("Audi");
		audi.run();
		
		//get byd
		Byd byd = (Byd) CarFactory.createCar("Byd");
		byd.run();
		
	}
}
