package com.test.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		IRealStar star = new RealStar();
		IRealStar proxyStar = (IRealStar) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{IRealStar.class}, new ProxyStar(star));
		proxyStar.playGuitar();
	}
}
