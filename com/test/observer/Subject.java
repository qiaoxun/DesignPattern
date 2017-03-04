package com.test.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	protected List<Observer> observerList = new ArrayList<>();

	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	public void notifyAllObserver() {
		for(Observer o : observerList){
			o.update(this);
		}
	}
}

class ConcreteSubject extends Subject{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.notifyAllObserver();
	}
	
}