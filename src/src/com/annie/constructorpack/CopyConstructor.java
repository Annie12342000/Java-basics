package com.annie.constructorpack;
class E
{
	int i ;
	public E( int i )
	{
		this.i = i;
		
	}


public E(E obj) // copy constructor
{
	this.i = obj.i;
}

public void display()
{
	System.out.println(this.i);
}

public class CopyConstructor {

	public static void main(String[] args) {
		
     E obj1 = new E(10);
     obj1.display();
     
     E obj2 = new E(obj1);
     obj2.display();
     
     
	}

}
}
