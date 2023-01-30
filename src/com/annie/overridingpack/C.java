package com.annie.overridingpack;

class A {
 int result;
 public void m1(int a,int b){
	 result=a+b;
	 System.out.print("Addition: ");
 }
}

class B extends A{
	public void m1(int a, int b) {
		result=a-b;
		System.out.print("Subtraction: ");
		
	}
	
}
class C {
	public static void main(String[] args) {
		B b1=new B();
		b1.m1(10, 5);
		System.out.println(b1.result);
		
		A a1=new A();
		a1.m1(10, 5);
		System.out.println(a1.result);
	}
}
