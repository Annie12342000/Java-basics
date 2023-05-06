package com.annie.PrgmPrctice;

import java.util.Scanner;

public class BintoDec {
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("enter bin num");
	int bin = scn.nextInt();
	int dec = 0;
	int i = 1;
	
	while(bin>0)
	{
		int b  = bin%10;
		dec = dec + b*i;
		bin = bin/10;
		i*=2;
	}
	System.out.println("decimal = "  +dec);
	
	
	}
}
