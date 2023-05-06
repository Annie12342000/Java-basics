package com.annie.testing;

public class Array {
	
		public static void main(String[] args) {
			
		int num1 = 0;
		int num2 =0;
		int [] a = {1,3,5,2,5};
		int [] b = {3,6,2,7,8};
		  sort(a);
		
		
		for (int s:a)
		{
			System.out.println(s);
		}
		insort(b);
	    
		for(int p:b)
		{
			System.out.println(p);
		}
		 
		
		
	}
		
		public static  void sort(int [] a)
		{
			for(int i = 0; i<a.length-1;i++)
			{
				for(int j =0;j<a.length-1-i;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
						
					}
				}
				int num1 = a[i];
			}
		}
		
		public static void insort(int [] b)
		{
			for(int i = 0; i<b.length-1;i++)
			{
				for(int j =0;j<b.length-1-i;j++)
				{
					if(b[j]<b[j+1])
					{
						int temp = b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
						
					}
				}
				int num2 = b[i];
			}
			
		}
		public static void result(int [] s,int [] p)
		{
			for(int i = 0;i<s.length;i++)
			{
				for(int j = 0;j<p.length;j++)
				{
					int num1 = s[i];
					int num2 = p[j];
				
					int result = 0;
					result+= num1*num2;
					System.out.println(result);
					
				}
			}
		}
}
