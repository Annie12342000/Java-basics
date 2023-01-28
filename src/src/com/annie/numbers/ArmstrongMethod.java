package com.annie.numbers;

import java.util.Scanner;

public class ArmstrongMethod {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = scn.nextInt();
		System.out.println("enter second number:");
		int b = scn.nextInt();
		for(int i =a;i<=b;i++) {
		
		int res = armstrong(i);
		if(res==i)
		{
			System.out.println(i+ "is arm");
		}
		
		}
	}

	

	public static int armstrong(int num)
	{
		int sum = 0;
		int len=length(num);
		while(num>0)
		{
			int rem = num%10;
			num/=10;
			sum = sum + power(rem,len);
			
		}
		return sum;
	}

	public static int length(int num)
	{
		int count = 0;
		while(num>0) 
		{
		count++;
		num/=10;
	    }
        return count;
	}
	public static int power(int base,int exp)
	{
		int res = 1;
		for(int i =1; i <= exp; i++)
		{
			res=base*res;
			
		}
		return res;
	}
		
}