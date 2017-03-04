package com.test.factory.factoryMethod;

public class Client {
	public static void main(String[] args) {
		Audi audi = (Audi) new AudiFactory().createCar();
		audi.run();
		
		Byd byd = (Byd) new BydFactory().createCar();
		byd.run();
	}
}
