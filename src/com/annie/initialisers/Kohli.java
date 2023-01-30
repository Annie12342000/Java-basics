package com.annie.initialisers;

 class Kohli {
	 int a =10;
	  String s = "Ram";
	 
	 {
		 System.out.println(a);
		 System.out.println(s);
		 a=20;
		 s="sita";
	 }
     static 
     {
    	 System.out.println("static block");
     }
	public static void main(String[] args) {
		System.out.println("main starts");
		Kohli virat= new Kohli();
		System.out.println(virat.a);
		System.out.println(virat.s);
		

	}

}
