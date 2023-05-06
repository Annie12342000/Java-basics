package com.annie.interfacepack;

interface M
{
	void m1();
	void m2();
}

interface N extends M
{
	void m1();
	void m3();
}

class C extends Object implements N
{
	@Override
	public void m1()
	{
		System.out.println("m1() implemented for class C");
	}
	@Override
	public void m2()
	{
		System.out.println("m2() implemented for class C");
	}
	@Override
	public void m3()
	{
		System.out.println("m3() implemented for class C");
	}
	
	public void m4()
	{
		System.out.println("m4() specific method defined for class C");
	}

}

public class MultipleInher {

	public static void main(String[] args) {
     
		N nref = new C();
		nref.m1();
		nref.m2();
		nref.m3();
		((C)nref).m4();
		
		

	}

}
