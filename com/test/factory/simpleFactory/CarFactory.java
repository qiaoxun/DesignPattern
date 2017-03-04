package com.test.factory.simpleFactory;

public class CarFactory {	
	//简单工厂模式
	public static Car createCar(String type){
		if(type.equals("Audi")){
			return new Audi();
		}else if(type.equals("Byd")){
			return new Byd();
		}
		return null;
	}
	
}
