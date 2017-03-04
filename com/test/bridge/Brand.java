package com.test.bridge;

public interface Brand {
	void sale();
}


class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("sale Lenovo computer");
	}
}

class Apple implements Brand{
	@Override
	public void sale() {
		System.out.println("sale Apple computer");
	}
}