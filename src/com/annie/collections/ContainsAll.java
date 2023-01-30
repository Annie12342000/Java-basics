package com.annie.collections;

import java.util.ArrayList;

public class ContainsAll {

	public static void main(String[] args) {
	    ArrayList a1 = new ArrayList ();
	    a1.add(1);
	    a1.add(20);
	   
	    a1.add(60);
	    System.out.println(a1);
	    
	    ArrayList<Integer> a2 = new ArrayList<Integer>();
	    a2.add(1);
	    a2.add(20);
	    a2.add(60);
	    
	    System.out.println(a2);
	    
	    System.out.println(a1.containsAll(a2));
	   // System.out.println(a1);
         
	}

}
