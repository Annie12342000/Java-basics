package com.annie.numbers;
import java.util.Scanner;


public class primenumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = scn.nextInt();
		boolean flag = true;
		for(int i =2; i<=n/2; i++)
		{
			if(n%i==0) {
				System.out.println(n + " "  + "is not a prime number");
				flag = false;
				break;
				
			}
			if (flag) {System.out.println(n + " " + "is a prime number");}
		}
	}
}
		
		
		

	


