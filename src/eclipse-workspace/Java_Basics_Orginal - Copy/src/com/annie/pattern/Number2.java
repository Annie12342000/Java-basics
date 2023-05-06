package com.annie.pattern;
import java.util.Scanner;
public class Number2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a size");
		int n = scn.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j<=n; j++)
			{
				System.out.print(" ");
			}
				for (int j = 1; j<=i; j++)
				{
					System.out.print(j);
				}
				
				
				for(int j = i-1; j > 0; j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		for(int i = n-1; i>0; i--)
		{
			for(int j = i; j<=n; j++)
			{
				System.out.print(" ");
			}
				for (int j = 1; j<=i; j++)
				{
					System.out.print(j);
				}
				
				
				for(int j = i-1; j > 0; j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
	
	

	}

}


