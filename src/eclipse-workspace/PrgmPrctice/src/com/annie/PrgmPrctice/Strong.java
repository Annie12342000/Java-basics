package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int num = scn.nextInt();
		int fact;
		int rem = 0;
		int sum = 0;
		int originalNum = num;
		while(num>0)
		{
			rem = num%10;
			fact = 1;
		for(int i = 1; i<=rem; i++) {
			fact = fact*i;
		}
		sum+=fact;
		num/=10;
		}
		if(sum==originalNum)
		{
		System.out.println(originalNum + " is a strong number ");
		}
		else
		{
			System.out.println(originalNum + " is not a strong number ");
		}
		
	}

}
