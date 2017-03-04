package com.test.flyWeight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight black1 = ChessFlyWeightFactory.getChess("black");
		ChessFlyWeight black2 = ChessFlyWeightFactory.getChess("black");
		System.out.println(black1);
		System.out.println(black2);
		
		black1.display(new Coordinate(10,10));
		black2.display(new Coordinate(20,20));
		
	}
}
