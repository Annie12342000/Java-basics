package com.annie.constructorpack;

class B
{
	int length;
	int breadth;
    B(int length,int breadth)	
    {
    	this.length=length;
    	this.breadth=breadth;
    	
    }
    B (B r)
    {
    	this.length= r.length;
    	this.breadth= r.breadth;
    	
    }
    B (B r1, B r3)
    {
    	this.length= r1.length;
    	this.breadth= r3.breadth;
    }

public void areaOfRectangle()
{
	int res=length*breadth;
	System.out.println("Area=" +res);
}
public class Rectangle {
	

	public static void main(String[] args) {
		
		B r1=new B(10,29);
		
		r1.areaOfRectangle();
		B r2= new B(r1);
		r2.areaOfRectangle();
		B r3=new B(20,30);
		r3.areaOfRectangle();
		B r4=new B(r1,r3);
		r4.areaOfRectangle();
		
	}
}
}


