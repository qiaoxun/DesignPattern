package com.test.adapter;

public class Client {
	public static void main(String[] args) {
		Client client = new Client();
		Adaptee adaptee = new Adaptee();
//		Target t = new Adapter2();
		Target t = new Adapter(adaptee);
		client.request(t);
		
	}
	
	public void request(Target t){
		t.handleRequest();
	}
	
}
