package com.annie.overridingpack;

class Wife1
{
 public void marry()
 {
	
	 System.out.println("He will spend time with his first wife on");
 System.out.println("Monday");
 System.out.println("Tuesday");
 System.out.println("Wednesday");
 
 } 
}

class Wife2
{
	
 public void marry()
 {
	
	 System.out.println("He will spend time with his Second wife on");
 System.out.println("Thursday");
 System.out.println("Friday");
 System.out.println("Saturday");
 
 } 
}



public class Husband {

	public static void main(String[] args) {
		
		Wife2 w2=new Wife2();
		w2.marry();
		
		Wife1 w1=new Wife1();
		w1.marry();

	}

}
