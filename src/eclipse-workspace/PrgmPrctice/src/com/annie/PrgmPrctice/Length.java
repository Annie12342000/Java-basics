package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter num");
		int num = scn.nextInt();
		int count = 0;
		while(num>0) {
		num = num/10;
		count++;
		}
		
		System.out.println(count);
		
		
	}

}
