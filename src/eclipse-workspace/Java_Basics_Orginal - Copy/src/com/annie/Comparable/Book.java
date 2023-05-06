package com.annie.Comparable;

public class Book implements Comparable {
	public double price;
	
	public Book(double p)
	{
		price = p;
		
	}
	
	public String toString()
	{
		return "[" + "price:" +price + "]";
	}

	@Override
	public int compareTo(Object o) {
		Book b = (Book)o;
		if(price>b.price)return 1;
		if(price<b.price)return -1;
		return 0;
	}
}
