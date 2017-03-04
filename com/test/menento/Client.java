package com.test.menento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		Emp emp = new Emp();
		emp.setId(12);
		emp.setName("joey");
		emp.setNo("36");
		System.out.println(emp);
		taker.setEmpMemento(emp.getEmpMemento());
		
		emp.setId(1111);
		emp.setName("111");
		emp.setNo("11");
		
		System.out.println(emp);
		
		emp.recovery(taker.getEmpMemento());
		
		System.out.println(emp);
		
	}
}
