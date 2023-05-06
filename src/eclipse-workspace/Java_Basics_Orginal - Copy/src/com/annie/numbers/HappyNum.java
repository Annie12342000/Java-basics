package com.annie.numbers;
import java.util.Scanner;

public class HappyNum {
	public static int isHappyNumber(int num)
	{
		int rem=0,sum=0;
		
		while(num>0)
		{
			rem = num%10;
			sum+=rem*rem;
			num=num/10;
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = scn.nextInt();
		int result=num;
		
		while(result!=1 && result!=4)
			result = isHappyNumber(result);
		if(result==1)
			System.out.println("happy no.");
		else
			System.out.println("not a happy no.");
		
		
		
	}

}
