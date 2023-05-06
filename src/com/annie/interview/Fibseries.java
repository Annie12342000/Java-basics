package com.annie.interview;

import java.util.Stack;


public class Fibseries{
	public static void main(String[] args) {
		Stack q = new Stack();
		int n = 5;
		int fib;
		int a = 0,b=1,c;
		int spaces = 0;
		int odd = 0;
		for(int i = 1;i<n*2;i++)
		{
			c = a+b;
			a=b;
			b=c;
			
			odd++;
			for(int j =0;j<spaces;j++)
			{
				System.out.println(" ");
			}
			
			if(i<n*2)
			{
				if(odd%2==0)
				{
					q.push(a);
				}
				
			else
			{
				System.out.println(a+" ");
			
			System.out.println();
			spaces++;
			}
		}
		}
		
		
	
	
	spaces--;
	for(int i =1;i<n;i++)
	{
		int spaces1=0;
		spaces1--;
		for(int j = 0; j<spaces1; j++)
			System.out.println(" ");
		System.out.println(q.pop());
	}

 System.out.println();


}
}