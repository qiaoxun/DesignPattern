package com.test.bridge;

public class Computer {
	private Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void sale(){
		this.brand.sale();
	}
}


class LaptopComputer extends Computer{

	public LaptopComputer(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		super.sale();
		System.out.println("this is laptop");
	}
}


class DesktopComputer extends Computer{

	public DesktopComputer(Brand brand) {
		super(brand);
	}
	@Override
	public void sale() {
		super.sale();
		System.out.println("this is desktop");
	}
}

