package com.test.observer.jdk;

import java.util.Observable;

public class ConcreteSubject extends Observable {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		setChanged();
		notifyObservers(state);
	}
	
}
