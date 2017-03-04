package com.test.state;

public class Client {
	public static void main(String[] args) {
		Context ct = new Context();
		ct.changeState(new FreeState());
		ct.changeState(new BookedState());
	}
}
