package com.test.command;

public class Client {
	public static void main(String[] args) {
		Command command = new Command(new Receiver(),"raise the rent of house");
		
		Invoke i = new Invoke(command);
		
		i.call();
	}
}
