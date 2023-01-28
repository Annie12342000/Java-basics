package com.annie.interfacepack;

interface Iter1
{
	default void m1() //default method
	{
		System.out.println("default implementation for every class");
	}
	
	public void m2(); // abstract method
	static public void m3() // static method
	{
		System.out.println("I am static method for Interface");
	}
}

class E implements Iter1
{
	@Override
	public void m2()
	{
		System.out.println("m2() implemented for class E");
	}
}

public class Java8Interface {

	public static void main(String[] args) {
	   Iter1 i1 = new E();
	   i1.m1();
	   i1.m2();
	   Iter1.m3();
	   
	  
	   

	}

}
