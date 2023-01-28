package com.annie.numbers;
import java.util.Scanner;


public class NeonNum {
public static void main (String [] args)
{
	Scanner scn = new Scanner(System.in);
	System.out.println("enter a number:");
	int n = scn.nextInt();
	int sqr = n*n;
	int rem = 0;
	int sum = 0;
	int temp = n;
	 
	while(sqr>0)
	{
		rem = sqr%10;
		sum+=rem;
		sqr/=10;
		
	}
	if(sum==n)
	
		System.out.println("it's a neon no.");
		else
		
			System.out.println("it's not a neon no.");
		}
	
}

