package com.annie.array;

public class Bubblesort {

	public static void main(String[] args) {
		int [] a = {3,5,1,6,9,2};
		sort(a);
		for(int n:a)
		System.out.println(n);
	}
	static void sort(int [] a)
	{
		for(int i = 0; i<a.length-1; i++)
		{
			for(int j = 0;j<a.length-1-i;j++)
			{
				if (a[j]>a[j+1])
						{
					      int temp = a[j];
					      a[j] = a[j+1];
					      a[j+1] = temp;
						}
			}
		}
	}

}
