package com.annie.exception;
import java.util.Scanner;

public class Arithmetic {
 public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter 2 nums");
	int a = scn.nextInt();
	int b = scn.nextInt();
	int c = 0;
	try{
		System.out.println("try starts");
		if(b>a) {
			throw new ArithmeticException();
		}
		c=a/b;
		System.out.println("try ends");
		}catch(ArithmeticException e)
	{
			System.out.println("please enter b value greater than 0 and lesser than a value ");
			c = a/2;
			
	}
	
	System.out.println(c);
	
	}
}
