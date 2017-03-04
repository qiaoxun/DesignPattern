package com.test.state;

public interface State {
	void handle();
}

class FreeState implements State{
	@Override
	public void handle() {
		System.out.println("the state has been change to free");
	}
}

class BookedState implements State{
	@Override
	public void handle() {
		System.out.println("the state has been change to booked");
	}
}

