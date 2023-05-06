package com.annie.Alexainstanceof;
class A
{
	
}
class B extends A
{
	
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof Object);
		
	    B b = new B();
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(b instanceof Object);
		
		
		
		// Up casting
		A a1 = new B ();
		System.out.println(a1 instanceof A );
		System.out.println(a1 instanceof B );
		System.out.println(a1 instanceof Object );

 
 
	}

}
