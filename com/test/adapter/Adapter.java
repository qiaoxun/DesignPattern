package com.test.adapter;
/**
 * 适配器接口
 * @author joey
 */
public class Adapter  implements Target {
	private Adaptee adapter;
	
	public Adapter(Adaptee adapter) {
		this.adapter = adapter;
	}

	@Override
	public void handleRequest() {
		adapter.request();
	}

}
