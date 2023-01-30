package com.annie.superpack;
public class Super {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		

	}

}
class A
{
	public void m1()
	{
		System.out.println("m1() defined for class A");
	}
}
 class B extends A
 {
	 @Override
	 public void m1()
	 {
		 super.m1();
		 System.out.println("m1() defined for class B");
		 
	 }
 }