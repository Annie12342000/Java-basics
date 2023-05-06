package com.annie.numbers;

public class Recursion {
	static void m1(int i)
	
	{   System.out.println(i);
		if(i>10) return;
		System.out.println(i);
		//if(i==3) return;
		m1(i+1);
		//System.out.println(i);
		
	}

	public static void main(String[] args) {
		m1(1);
	}

}
