package com.test.chainofresponsiblity;

public class Client {
	public static void main(String[] args) {
		Director director = new Director("jack");
		Manager manager = new Manager("tom");
		director.setLeader(manager);
		
		director.hanlderRequest(new LeaveRequest(2,"marry"));
		director.hanlderRequest(new LeaveRequest(4,"joey"));
		
	}
}
