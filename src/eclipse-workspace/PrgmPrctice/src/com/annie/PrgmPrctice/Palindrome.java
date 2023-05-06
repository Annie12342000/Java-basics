package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int n = scn.nextInt();
		int temp = n;
        int rev =0;
		
		while(n>0)
		{
			int rem = n%10;
			rev=(rev *10) + rem;
			n/=10;
			if(rev==temp)
			{
				System.out.println("it is a palindrome number");
			}
			else {
		
			System.out.println("it's not a palindrome number");
			}


		

	}

}
}
