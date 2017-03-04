package com.test.state;

public class Context {
	private State state;
	
	public void changeState(State state){
		System.out.println("the state has changed");
		this.state = state;
		this.state.handle();
	}
	
}
