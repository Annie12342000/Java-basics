package com.annie.constructorpack;

class D{
	int i ;
	int j ;
    
	public void initialise()
	{
		i = 10;
		j = 20;
		
	}
    
	public void initialise(int n)
	{
		this.i = n;
		this.j = n;
		
	}
	
	public void initialise(int i,int j)
	{
		this.i = i;
		this.j = j;
		
	}
public class E
{

	public static void main(String[] args) {
     
		D a1= new D();
		a1.initialise();
		System.out.println(a1.i);
		System.out.println(a1.j);
		
		a1.initialise(100);
		System.out.println(a1.i);
		System.out.println(a1.j);
		
		a1.initialise(100,200 );
		System.out.println(a1.i);
		System.out.println(a1.j);
		
		

	}

}
}

