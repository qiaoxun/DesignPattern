package com.test.command;

public class Command {
	private Receiver receiver;
	private String commandContent;

	public Command(Receiver receiver,String commandContent) {
		super();
		this.receiver = receiver;
		this.commandContent = commandContent;
	}
	
	public void action(){
		this.receiver.action(commandContent);
	}
}
