package com.test.menento;

public class Emp {
	
	private int id;
	private String name;
	private String no;
	
	public void recovery(EmpMemento empMemento){
		this.id = empMemento.getId();
		this.name = empMemento.getName();
		this.no = empMemento.getNo();
	}
	
	public EmpMemento getEmpMemento(){
		return new EmpMemento(this);
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

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", no=" + no + "]";
	}
	
}
