package com.test.singleTon;
/**
 * 双重检锁模式
 * @author joey
 *
 */
public class SingleTonDemo6 {
	private static SingleTonDemo6 instance;
	
	public static SingleTonDemo6 getInstance()
	{
	  if (instance == null)
	  {
	    synchronized(SingleTonDemo6.class) {      //1
	    	SingleTonDemo6 inst = instance;         //2
	      if (inst == null)
	      {
	        synchronized(SingleTonDemo6.class) {  //3
	          inst = new SingleTonDemo6();        //4
	        }
	        instance = inst;                 //5
	      }
	    }
	  }
	  return instance;
	}
}
