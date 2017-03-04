package com.test.decorator;

public class Client {
	public static void main(String[] args) {
		ICar car = new Car();
		SuperCar sc = new SuperCar(car);
		FlyCar flyCar = new FlyCar(sc);
//		flyCar.move();
		
		SwimCar swimCar = new SwimCar(flyCar);
		swimCar.move();
	}
}
