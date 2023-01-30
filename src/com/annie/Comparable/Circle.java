package com.annie.Comparable;

public class Circle implements Comparable {
	int radius;
	public Circle(int r )
	{
		radius =r;
		
	}
	public int compareTo(Object arg)
	{
		return radius - ((Circle)arg).radius;
	}
}

