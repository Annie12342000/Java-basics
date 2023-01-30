package com.annie.interfacepack;
interface Iter
{
	int i = 10; // only public static final are permitted
	public abstract void m1();
	void m2(); //internally same as above 
	
}

class A implements Iter
{
	@Override
	public void m1()
	{
		System.out.println("m1() implemented for class A");
	}
	
	@Override
	public void m2()
	{
		System.out.println("m2() implemented for class A");
	}
	
	public void m3() // specific method
	{
		System.out.println("m3() defined for class A");
	}
}

public class Interface {
	public static void main(String[] args) {
		Iter it =  new A();
		it.m1();
		it.m2();
		
		// it.m3(); // not possible
		
		((A)it).m3();
	}
}
		
		
		
		
		
		
	
