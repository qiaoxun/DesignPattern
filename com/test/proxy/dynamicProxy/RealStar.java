package com.test.proxy.dynamicProxy;

public class RealStar implements IRealStar{
	public void signContract(){
		System.out.println("sing contract");
	}
	
	public void playGuitar(){
		System.out.println("Eric Clapton and Mark Knopfler are playing guitar");
	}
}
