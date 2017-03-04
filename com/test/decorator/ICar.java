package com.test.decorator;

public interface ICar {
	void move();
}

class Car implements ICar{
	@Override
	public void move() {
		System.out.println("move in road");
	}
}


class SuperCar implements ICar{
	private ICar car;
	
	public SuperCar(ICar car){
		this.car = car;
	}
	
	@Override
	public void move() {
		this.car.move();
	}
}

/**
 * fly
 * @author joey
 *
 */
class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("fly to the sky");
	}
	
	public void move(){
		super.move();
		fly();
	}
}

class SwimCar extends SuperCar{

	public SwimCar(ICar car) {
		super(car);
	}
	
	public void swim(){
		System.out.println("swim in the sea");
	}
	
	public void move(){
		super.move();
		swim();
	}
	
}







