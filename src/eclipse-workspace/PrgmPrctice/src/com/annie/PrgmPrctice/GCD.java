package com.annie.PrgmPrctice;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first num");
		int a = scn.nextInt();
		System.out.println("enter second num");
		int b = scn.nextInt();
		int gcd =0;
		for(int i = 1; i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd = i;
			}
			
		}
		System.out.println(gcd);
		}

}
