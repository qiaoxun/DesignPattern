package com.test.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreateMyAggregate {
	
	private List<String> list = new ArrayList<>();
	
	public void add(String str){
		list.add(str);
	}
	
	public MyIterator getIterator(){
		return new MyIteratorImpl();
	}
	
	private class MyIteratorImpl implements MyIterator{
		
		private int cursor;
		
		@Override
		public void first() {
			cursor=0;
		}

		@Override
		public void next() {
			if(cursor<list.size()){
				cursor++;
				System.out.println("next "+ cursor);
			}
		}

		@Override
		public boolean hasNext() {
			System.out.println("has next" + cursor);
			return cursor<list.size();
		}

		@Override
		public boolean isFirst() {
			return cursor==0;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1);
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
		public int getCursor(){
			return cursor;
		}
	}
	
}
