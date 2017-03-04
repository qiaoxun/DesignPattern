package com.test.singleTon;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/*
 * 破解懒汉单例模式
 */
public class Client1 {
	public static void main(String[] args) throws Exception  {
//		SingleTonDemo2_1 instance = SingleTonDemo2_1.getInstance();
//		Class clazz = SingleTonDemo2_1.class;
//		Constructor<?> constructor = clazz.getDeclaredConstructor(null);
//		constructor.setAccessible(true);
//		Object obj = constructor.newInstance(null);
//		System.out.println(obj);
//		System.out.println(instance);
		test2();
	}
	
	//使用反射，破解单例模式
	public static void test1() throws Exception{
		SingleTonDemo2 instance = SingleTonDemo2.getInstance();
		Class clazz = SingleTonDemo2.class;
		Constructor<?> constructor = clazz.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		Object obj = constructor.newInstance(null);
		System.out.println(obj);//com.test.singleTon.SingleTonDemo2@b0014f0
		System.out.println(instance);//com.test.singleTon.SingleTonDemo2@325e9e34
	}
	
	//使用序列化和反序列化破解
	public static void test2() throws Exception{
		SingleTonDemo2_1 instance = SingleTonDemo2_1.getInstance();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(instance);
		oos.flush();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		SingleTonDemo2_1 instance2 = (SingleTonDemo2_1) ois.readObject();
		
		System.out.println(instance);
		System.out.println(instance2);
	}
	
}
