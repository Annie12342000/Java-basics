package com.annie.pattern;
import java.util.Scanner;

public class Pattern1 {

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
				for (int j = 1; j<=i*2-1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		
		
		}
	}
		
		
		

	


