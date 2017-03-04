package com.test.observer;

public interface Observer {
	void update(Subject subject);
}

class ObserverA implements Observer{
	private String state;
	@Override
	public void update(Subject subject) {
		this.state = ((ConcreteSubject) subject).getState();
		System.out.println(this + "  " +this.state);
	}
	
}
