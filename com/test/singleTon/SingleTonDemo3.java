package com.test.singleTon;

/**
 * 静态内部类实现方式
 * @author joey
 */
public class SingleTonDemo3 {
	private SingleTonDemo3(){
		
	}
	
	private static class SingleTonClass{
		private static SingleTonDemo3 instance = new SingleTonDemo3();
	}
	
	public static SingleTonDemo3 getInstance(){
		return SingleTonClass.instance;
	}
	
}
