package com.test.factory.abstractFactory;

import java.util.Calendar;

public class Client {
	public static void main(String[] args) {
		CarFactory luxury = new LuxuryCarFactory();
		Engine luxuryEngine = luxury.createEngine();
		luxuryEngine.run();
		luxuryEngine.start();
		Calendar c = Calendar.getInstance();
	}
}
