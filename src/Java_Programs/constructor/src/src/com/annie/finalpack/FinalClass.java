package com.annie.finalpack;
class Color
{
	public void paint()
	{
		System.out.println("cyan");
	}
}
class Red extends Color
{ @Override
	public void paint()
	{
	super.paint();
		System.out.println("blue");
	}
}

public class FinalClass {
	public static void main(String[] args) {
		Red red = new Red();
		red.paint();// cannot override the final method of parent class(color)
		
	}

}
