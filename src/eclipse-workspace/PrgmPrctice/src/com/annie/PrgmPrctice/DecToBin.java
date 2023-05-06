package com.annie.PrgmPrctice;

import java.util.Scanner;

public class DecToBin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter dec num");
		int dec = scn.nextInt();
		int pos = 1;
		int bin = 0;
		while(dec>0)
		{
			int b = dec%2;
			bin= bin + (b*pos) ;
			dec = dec/2;
		
		pos = pos*10;
		}
		System.out.println("binaryNum = "  +bin);
		
	}
	

}
