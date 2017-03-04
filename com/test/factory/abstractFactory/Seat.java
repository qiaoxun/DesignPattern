package com.test.factory.abstractFactory;

public interface Seat {
	void message();
}

class LuxurySeat implements Seat{
	@Override
	public void message() {
		System.out.println("可以按摩");
	}
}

class LowSeat implements Seat{
	@Override
	public void message() {
		System.out.println("不可以按摩");
	}
}