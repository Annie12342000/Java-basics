package com.annie.PrgmPrctice;

import java.util.Scanner;

public class NextPalindrome {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int n = scn.nextInt();
        int rev =0;
      while(n>0)
        {
		   n++;
		   int temp = n;
		while(n>0)
		{
			int rem = n%10;
			rev=(rev *10) + rem;
			n/=10;
		
	   	}
		
		   if(rev==temp)
			{
				System.out.println(rev);
			}
			
        }

        }
	}

	
	

	