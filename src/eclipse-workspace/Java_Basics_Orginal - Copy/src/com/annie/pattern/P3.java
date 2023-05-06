package com.annie.pattern;

public class P3 {

	public static void main(String[] args) {
		int n =5;
	
		for (int i =1; i<=n ; i++)
		{
			for(int j =i;j<=n;j++)
			{
		      System.out.print(j+" ");
			}
			for(int j = n-1; j>=i;j--)
			{
				System.out.print(j+ " ");
			}
			System.out.println();

	}
	}
}
