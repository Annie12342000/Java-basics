package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Neon {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter a num");
	int n = scn.nextInt();
	int sqr = n*n;
	int sum = 0;
	int rem = 0;
	int temp = n;
	
	while(sqr>0)
	{
		rem = sqr%10;
		sum= sum +rem;
		sqr = sqr/10;
	}
	 
	 if(sum==temp) {
	 System.out.println("it's a neon number");
	 }
	 else {
		 System.out.println("it's not a neon number");
	 }
}
}
