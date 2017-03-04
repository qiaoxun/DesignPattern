package com.test.menento;

public class EmpMemento {
	private int id;
	private String name;
	private String no;
	
	public EmpMemento(Emp emp) {
		this.id = emp.getId();
		this.name = emp.getName();
		this.no = emp.getNo();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
}
