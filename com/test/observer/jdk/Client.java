package com.test.observer.jdk;

public class Client {
	public static void main(String[] args) {
		ConcreteSubject sub = new ConcreteSubject();
		ObserverA observer = new ObserverA();
		sub.addObserver(observer);
		sub.setState("123");
	}
}
