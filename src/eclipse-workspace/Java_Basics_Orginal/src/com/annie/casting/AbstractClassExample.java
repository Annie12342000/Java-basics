package com.annie.casting;

abstract class A
{
	int i = 10;
	static int j = 100;
	
	public A()
	
	{
		System.out.println("constructor of class A");
	}
	
	public void m1()
	{
		System.out.println("m1() defined for class A");
	}
	
	public void m2()
	{
		System.out.println("m2() defined for class A");
	}
	
	abstract public void m3();
	
	}

class B extends A
{
	@Override
	public void m3()
	{
		System.out.println("m3() defined for class B");
	}
	
	public void m4() // specific method
	{
		System.out.println("m4() defined for class B");
	}
}
public class AbstractClassExample {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();
		a.m3();
		System.out.println(A.j);
		System.out.println(a.i);
		
		((B)a).m4();
		
	}

}
