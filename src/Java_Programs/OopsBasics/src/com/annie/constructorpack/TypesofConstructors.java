package com.annie.constructorpack;
class C
{
	int a ;int b; // default constructor
	//C() // no arg constructor
	C(int i,int j) // parameterised constructor
	{
		a=i;
		b=j;
	}
}

 class TypesofConstructors {
	 public static void main(String[] args) {
		 C c = new C(1,2);
		 System.out.println(c.a);
		 System.out.println(c.b);
		
	}

}
