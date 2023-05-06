package com.annie.Comparable;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(30);
		
		int res = c1.compareTo(c2);
		
		System.out.println(res);
		

	}

}
