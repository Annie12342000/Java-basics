package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int n = scn.nextInt();
		
		int a = 0 , b = 1 , c;
		for(int i = 1 ; i <= n;i++)
		{
			System.out.print(a + " ");
			
			c= a+b;
			a=b;
			b=c;
		}
	}
}
