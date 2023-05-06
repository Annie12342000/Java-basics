package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Armstrong {
	public static void isArmstrong(int start)
	{
		int sum = 0;
		int count = 0;
		int num = start;
		
		while(num>0)
		{
			count++;
			num = num /10;
		}
		num = start;
		while(num>0) {
		int rem = num%10;
		int fact = 1;
		for(int i = 1;i<=count;i++)
		{
			fact = fact * rem;
		}
		
			sum = sum + fact;
		
		num = num/10;
	}
	
	if(start==sum) {
		System.out.println(sum);
	}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scn.nextInt();
		System.out.println("enter second number");
		int b = scn.nextInt();
		
		for(int i = a;i<=b;i++)
		{
         	 isArmstrong(i);
		}
		
		

	}

}
