package com.annie.numbers;

import java.util.Scanner;

public class StrongInRange {
	public static int fact(int n)
	{
		int fact = 1;
		for(int i = 1; i<=n; i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static int strong(int n)
	{
		
		
		
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			sum = sum +fact(rem);
			n/=10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a =scn.nextInt();
        System.out.println("Enter second number : ");
        int b = scn.nextInt();
        for(int i=a;i<=b;i++)
        {
        	if(i==StrongInRange.strong(i))
        	{
        	System.out.println("printing strong numbers from" +a+ "to"  +b+ ":" +i );
        }
        }

	}
	
	

}
