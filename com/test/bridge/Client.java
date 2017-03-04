package com.test.bridge;

public class Client {	
	public static void main(String[] args) {
		Brand brand = new Apple();
		Computer computer = new LaptopComputer(brand);
		computer.sale();
	}
}
