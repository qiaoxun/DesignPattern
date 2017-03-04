package com.test.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
//原型模式
public class Client {
	public static void main(String[] args) throws Exception {
//		test();
		test2();
	}
	//深拷贝
	public static void test2() throws Exception{
		PrototypeTest pt = new PrototypeTest();
		Date d = new Date();
		pt.setName("first");
		pt.setNow(d);
		System.out.println(pt.getNow());
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(pt);
		oos.flush();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		PrototypeTest ptClone = (PrototypeTest) ois.readObject();
		d.setTime(1132132113231L);
		System.out.println(ptClone.getName());
		System.out.println(ptClone.getNow());
		ois.close();
		bis.close();
		oos.close();
		bos.close();
	}
	
	//浅拷贝
	public static void test() throws Exception{
		PrototypeTest pt = new PrototypeTest();
		Date d = new Date();
		pt.setName("first");
		pt.setNow(d);
		System.out.println(pt.getNow());
		PrototypeTest ptClone = (PrototypeTest) pt.clone();
		d.setTime(1132132113231L);
		System.out.println(ptClone.getName());
		System.out.println(ptClone.getNow());
	}
}
