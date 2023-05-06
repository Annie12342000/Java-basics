package com.annie.constructorpack;
class A1
{
	int a,b;
	A1(int n)
	{
	 this(n,n);	
	}
	
	A1(int a , int b )
	{
		this.a = a;
		this.b = b;
	}
	public void multiply()
	{
		System.out.println(a * b);
		
	}
}

public class constructorcalling {
	public static void main(String[] args) {
		A1 a1 = new A1(5);
		a1.multiply();
		A1 a2 = new A1(3,4);
		a2.multiply();
		
	}

}
