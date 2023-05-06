package com.annie.array;

public class Selectionsort {
	public static void main(String [] args) {
	int [] a = {6,8,3,9,4,8,2};
	sort(a);
	for(int n :a)
	
		System.out.println(n);
	}

	static void sort(int [] a)
	{
		for(int i= 0; i<a.length-1; i++)
		{
			int index = i;
		
			for(int j = i+1; j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index = j;
					
				}
				
				if(i!=index)
				{
					int t = a[index];
					a[index] = a[i];
					a[i] = t;
				}
			}
		}
	
	}
}