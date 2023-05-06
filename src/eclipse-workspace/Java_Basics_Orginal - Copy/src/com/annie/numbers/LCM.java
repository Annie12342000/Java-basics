package com.annie.numbers;
import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scn.nextInt();
		int a = 6;
		int b = 12;
		 n = a>b ? a:b;
		while(true)
		{
			if(a%n==0 && b%n==0)
				break;
			n--;
			
		}
		
        System.out.println("gcd of" +a+ "and" +b+ "is" +n );
	}

}
