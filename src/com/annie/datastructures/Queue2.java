package com.annie.datastructures;

public class Queue2 {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		
		System.out.println(q.peek());
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
		
	}
	

}
