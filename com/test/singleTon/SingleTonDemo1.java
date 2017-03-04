package com.test.singleTon;

/**
 * 饿汉单例模式
 * @author joey
 */
public class SingleTonDemo1 {
	private SingleTonDemo1(){}
	//类初始化时直接加载对象（没有延时加载的优势），加载类时，天然是线程安全的
	private static SingleTonDemo1 instance = new SingleTonDemo1();
	//方法没有同步，调用效率高
	public static SingleTonDemo1 getInstance(){
		return instance;
	}
}
