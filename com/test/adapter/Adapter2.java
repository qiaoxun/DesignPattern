package com.test.adapter;
/**
 * 适配器接口
 * @author joey
 */
public class Adapter2 extends Adaptee implements Target {

	@Override
	public void handleRequest() {
		super.request();
	}

}
