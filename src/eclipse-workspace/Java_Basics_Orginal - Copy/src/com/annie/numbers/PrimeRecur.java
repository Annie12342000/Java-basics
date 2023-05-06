package com.annie.numbers;
import java.util.Scanner;
public class PrimeRecur {


static boolean isPrime(int n , int f)
{
	if(f==n/2)
		return true;
	if(n%f==0 || n==1)
		return false;
	else
		return isPrime(n,f+1);
}

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter a number:");
	int n = scn.nextInt();
	if(isPrime(n,2))
	{
		System.out.println(n+ "is prime");
	}
	else
	{
		System.out.println(n+ "is not prime");
	}

		
}
}


	
