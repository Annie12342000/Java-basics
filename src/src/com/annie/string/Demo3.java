package com.annie.string;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s1=scn.next();
		
		int n=s1.length();
		char[] a=s1.toCharArray();
		
		for(int i=0;i<n/2;i++)
		{
			if (!(a[i]==a[n-(i+1)]))
				{	
					System.out.println("String is not a Palindrome");
					return;
				}
				
		}
		System.out.println("The string is a palindrome");
		}

}
