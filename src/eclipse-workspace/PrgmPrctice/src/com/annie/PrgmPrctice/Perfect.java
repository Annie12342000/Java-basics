package com.annie.PrgmPrctice;

import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a  num");
		int num = scn.nextInt();
		int sum = 0;
		for(int i = 1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		if(sum==num) {
		System.out.println("it's a perfect number");
		}
		else{
			System.out.println("it's not a perfect");
		}
		
	}
	}
