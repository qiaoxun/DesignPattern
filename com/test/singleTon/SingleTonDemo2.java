package com.test.singleTon;
/**
 * 懒汉模式
 * @author joey
 */
public class SingleTonDemo2 {
//类初始化时，不初始化这个对象（延时加载，真正用时再创建）
	private static SingleTonDemo2 instance;
	private SingleTonDemo2(){
	}
	//方法同步，调用效率低
	public static synchronized SingleTonDemo2  getInstance(){
		if(null==instance){
			instance = new SingleTonDemo2();
		}
		
		return instance;
	} 
	
}
