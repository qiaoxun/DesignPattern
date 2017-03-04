package com.test.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyStar implements InvocationHandler{
	private IRealStar realStar;
	
	public ProxyStar(IRealStar realStar) {
		super();
		this.realStar = realStar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("playGuitar")){
			System.out.println("invoke");
			method.invoke(this.realStar, args);
		}
		return null;
	}
	
}
