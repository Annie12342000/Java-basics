package com.annie.constructorpack;
class A
{  
	A()
	{
		this(10);
		System.out.println("no arguments");
	}
	A(int i )
	{
		this(10,20);
		
		System.out.println("1 argument");
		System.out.println(i);
	}
	A(int i, int j ){
		
		System.out.println("2 arguments");
		System.out.println(i+" "+j);
	}
}

public class CalltoThis {

	public static void main(String[] args) {
		A a =new A();
		
	}

}

	


