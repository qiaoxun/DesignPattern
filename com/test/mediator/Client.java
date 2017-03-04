package com.test.mediator;

public class Client {
	public static void main(String[] args) {
		IMediator manager = new Manager();
		
		IDepartment develop = new Development(manager);
		IDepartment sales = new Sales(manager);
		
		develop.outAction();
	}
}
