package com.test.singleTon;

import java.io.Serializable;

/**
 * 懒汉模式
 * @author joey
 */
public class SingleTonDemo2_1 implements Serializable{
	//类初始化时，不初始化这个对象（延时加载，真正用时再创建）
	private static SingleTonDemo2_1 instance;
	private SingleTonDemo2_1(){
		//防止反射破解
		if(null!=instance){
			throw new RuntimeException("不能通过反射破解");
		}
		System.out.println("构造器被调用");
	}
	//方法同步，调用效率低
	public static synchronized SingleTonDemo2_1  getInstance(){
		if(null==instance){
			instance = new SingleTonDemo2_1();
		}
		
		return instance;
	} 
	
	
	// 在反序列化时，直接调用这个方法，返回指定的对象，无需再新建一个对象
    private Object readResolve() {
        return instance;
    }
}
