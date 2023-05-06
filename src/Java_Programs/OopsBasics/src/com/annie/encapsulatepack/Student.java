package com.annie.encapsulatepack;
class A
{
	private int i;
	
	public int getI()
	{
		return i;
	}
	public void setI(int i)
	{
		this.i=i;
		
	}
}
  

public class Student {

	public static void main(String[] args) {
		A a =new A();
		System.out.println(a.getI());
		a.setI(22);
		System.out.println(a.getI());
	}

}
