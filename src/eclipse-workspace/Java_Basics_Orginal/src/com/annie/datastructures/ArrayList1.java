package com.annie.datastructures;

public class ArrayList1{
    
    public static void main(String[]args) {
  	  ArrayList l = new ArrayList();
  	  System.out.println("size=" +l.size());
  	  
  	  l.add(10);
  	  l.add(20);
  	  l.add(30);
  	  l.add(40);
  	  l.add(60);
  	  
  	  System.out.println("size=" +l.size());
  	  System.out.println(l);
  	  int i = (Integer)l.get(4);
  	  System.out.println(i);
    }
   }