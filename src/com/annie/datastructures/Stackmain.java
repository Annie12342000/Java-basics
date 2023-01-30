package com.annie.datastructures;

public class Stackmain {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(40);
		s.push(20);
		s.push(10);
		s.push(80);
		
		System.out.println(s.peek());
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}

	}

}
