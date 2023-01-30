package com.annie.collections;
import java.util.ArrayList;
public class Retainall {
	public static void main(String[] args) {
		ArrayList<Object> a1= new ArrayList<Object>();
		a1.add(10);
		a1.add("asish");
		a1.add(40.00);
		a1.add(50.5f);
		System.out.println(a1);
//		System.out.println(a1.size());
//		System.out.println(a1.isEmpty());

		
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("a");
		a2.add("b");
		a2.add("hguh");
		System.out.println(a2);
		a1.addAll(a2);
		a1.removeAll(a2);
		System.out.println(a1);
		
		
		
	}

}
