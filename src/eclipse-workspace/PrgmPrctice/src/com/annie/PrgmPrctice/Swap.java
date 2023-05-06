package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner scn = new  Scanner(System.in);
		System.out.println("enter first number");
		int a = scn.nextInt();
		System.out.println("enter second number");
		int b = scn.nextInt();
		
		System.out.println("before swapping " +a+ " and "  +b);
	    
		a = a+b;
		b = a-b;
		a = a-b;
	
		System.out.println(" after swapping " +a+ " and " +b);
		
	
	
	}

}
