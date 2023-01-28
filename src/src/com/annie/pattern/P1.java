package com.annie.pattern;

public class P1 {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i =1; i<=n ; i++)
		{
			for(int j =1;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(0);
				}
			}
			
			for(int j=i;j<n;j++)
			{
				System.out.print(0);
			}
			System.out.println();
		}

	}

}
