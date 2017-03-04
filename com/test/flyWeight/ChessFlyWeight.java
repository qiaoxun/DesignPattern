package com.test.flyWeight;

public interface ChessFlyWeight {
	void setColor(String color);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight{
	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("color is "+color);
		System.out.println("position X : "+c.getX()+" Y : "+c.getY());
	}
	
}
