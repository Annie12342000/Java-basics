package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Niven {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a num");
		int n = scn.nextInt();
        int sum = 0 ;
        int temp =n;
        int rem;
        while(n>0)
        {
        	rem = n%10;
        	sum+=rem;
        	n/=10;
        }
        if(temp%sum==0) 
        
        	System.out.println("it is a niven num");
        
        else 
        
        	System.out.println("it is not a niven num");
        	
        
        
        }
}
