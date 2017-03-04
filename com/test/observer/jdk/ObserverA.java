package com.test.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer {
	
	private String state;
	
	@Override
	public void update(Observable o, Object arg) {
		this.state = (String) arg;
		System.out.println(o+"  "+state);
	}

}
