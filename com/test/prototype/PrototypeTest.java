package com.test.prototype;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PrototypeTest implements Cloneable ,Serializable{
	
	private Date now;
	
	private String name;
	
	public Date getNow() {
		return now;
	}
	public void setNow(Date now) {
		this.now = now;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
