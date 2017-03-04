package com.test.command;

public class Invoke {
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	public void call(){
		this.command.action();
	}
}
