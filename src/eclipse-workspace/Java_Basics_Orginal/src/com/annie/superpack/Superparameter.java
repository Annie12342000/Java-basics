package com.annie.superpack;
class C
{
	int i;
	 int j ;
	 public C()
	 {
		 
	 }
	 public C(int i, int j)
	 {
		 this.i = i;
		 this.j = j;
		 
	 }
	 public void displayC()
	 {
		 System.out.println(i + " " + j);
		 
	 }
}
class D extends C
{
		 int i;
		 int j ;
		 
		 public D()
		 {
			 
		 }
		 
		 public D(int i, int j)
		 { 
			 super.i = i;
			 super.j = j;
			 this.i = i;
			 this.j = j;
		 }
	 
	 public void displayD()
	 {
		 System.out.println(i + " " + j);
		 
	 }
}	
public class Superparameter {

	public static void main(String[] args) {
		D d = new D(3,5);
		d.displayC();
		d.displayD();
		


	}

}
