package com.annie.PrgmPrctice;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first num");
		int a = scn.nextInt();
		System.out.println("enter second num");
		int b = scn.nextInt();
		int lcm =0;
		lcm = (a>b)?a:b;
		while(true)
		{
			if(lcm%a==0&&lcm%b==0)
			{
			   System.out.println("lcm of a and b is " + " " +lcm);
			   break;
			}
			lcm++;
			
		}
	}
}