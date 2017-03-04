package com.test.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreateMyAggregate cma = new ConcreateMyAggregate();
		cma.add("aa");
		cma.add("bb");
		cma.add("cc");
		
		MyIterator i = cma.getIterator();
		while(i.hasNext()){
			System.out.println(i.getCurrentObj());
			i.next();
		}
	}
}
