package com.annie.string;

class Rectangle
{
	int length;
	int breadth;
	
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public boolean equals(Object args)
	{
		if(!(args instanceof Rectangle)) return false;
		Rectangle r=(Rectangle) args;
		return this.length==r.length && this.breadth==r.breadth;
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle(10,20);
		Rectangle r2=new Rectangle(10,30);
		Rectangle r3=new Rectangle(10,20);
		
		System.out.println(r1.equals(r2));
		System.out.println(r2.equals(r3));
		System.out.println(r3.equals(r1));
	}

}
