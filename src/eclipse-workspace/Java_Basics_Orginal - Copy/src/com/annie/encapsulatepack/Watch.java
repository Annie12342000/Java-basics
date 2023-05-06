package com.annie.encapsulatepack;
class Watch
{
	private String name;
	private double price;
	private String color;
	
	public String getname()
	{
		return name;
		
	}
	 
	public void setname(String name)
	{
		this.name = name;
		
	}
	
	public double getprice()
	{
		return price;
		
	}
	
	public void setprice(double price)
	{
		this.price =  price;
		
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public void setcolor(String color)
	{
		this.color =  color;
		
	}
	 public Watch (String name, double price, String color)
	 {
		 this.name =  name;
		 this.price = price;
		 this.color = color;
		 
	 }
	 public void watchDetails()
	 {
		 System.out.println("Enter watch name:" + name);
		 System.out.println("Enter watch price:" + price);
		 System.out.println("Enter watch color:" + color);

	 }
	 
}
 
 

