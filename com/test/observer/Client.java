package com.test.observer;

public class Client {
	public static void main(String[] args) {
		Observer a = new ObserverA();
		Observer a1 = new ObserverA();
		Observer a2 = new ObserverA();
		ConcreteSubject sub = new ConcreteSubject();
		sub.registerObserver(a);
		sub.registerObserver(a1);
		sub.registerObserver(a2);
		
		sub.setState("111");
	}
}
