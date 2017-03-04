package com.test.proxy.staticProxy;

public class ProxyStar {
	private RealStar realStar;

	public ProxyStar(RealStar realStar) {
		super();
		this.realStar = realStar;
	}
	
	public void signContract(){
		System.out.println("ProxyStar sing contract");
	}
	
	public void playGuitar(){
		this.realStar.playGuitar();
	}
	
}
