package com.annie.numbers;
import java.util.Scanner;


public class XylemPhloem {

	public static void main(String[] args) {
		
		int num, extreme_sum = 0, mean_sum = 0, n;
		
		Scanner scn = new Scanner (System.in);
		System.out.println("enter a number:");
		num = scn.nextInt();
		n = Math.abs(num);
		
		while(n!=0)
		{
			if(n==num||n<10)
			{	extreme_sum = extreme_sum + n%10;
				System.out.println("the sum of extreme digits:" +extreme_sum);
			}
			else 
			{
				mean_sum = mean_sum + n%10;
				System.out.println("the sum of mean digits:" +mean_sum);
			}
			n = n/10;
		}
	
		//System.out.println("the sum of extreme digits:" +extreme_sum);
		//System.out.println("the sum of mean digits:" +mean_sum);
		
		if(extreme_sum  == mean_sum)
		{
			System.out.println(num + " "+ "is a xylem number");
		}
		else 
		{
			System.out.println(num + " is a phloem number");
		}
		
	}

}
