package com.annie.initialisers;

 class A {
	 int a =10;
	 static int b = 20;
	 
	 static
	 {
		 System.out.println(b);
		 b++;
		 
	 }
     
	 {
		 System.out.println(a);
		 a++;
		 
	 }
	 public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(b);
	}
}
