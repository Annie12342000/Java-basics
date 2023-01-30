package com.annie.datastructures;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Abc {

	public static void main(String[] args) {
		Queue q = new PriorityQueue(new Desc());
		q.add(10);
		q.add(30);
		q.add(60);
		q.add(40);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
			}

}



  class Desc implements Comparator{

		public int compare(Object o1, Object o2) {
			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;
			
	  
		return ((Integer) o2).intValue()-((Integer) o1).intValue();
	}

}
