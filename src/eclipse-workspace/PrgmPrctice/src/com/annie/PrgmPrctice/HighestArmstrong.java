package com.annie.PrgmPrctice;

import java.util.Scanner;

public class HighestArmstrong {
	public static void isArmstrong(int n)   
	{   
	int temp, digits=0, last=0, sum=0;   
	//assigning n into a temp variable  
	temp=n;   
	//loop execute until the condition becomes false  
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{   
	//determines the last digit from the number      
	last = temp % 10;   
	//calculates the power of a number up to digit times and add the resultant to the sum variable  
	sum +=  (Math.pow(last, digits));   
	//removes the last digit   
	temp = temp/10;   
	}  
	//compares the sum with n  
	if(n==sum)   {
		System.out.println(sum);
	}
	}   


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter first number");
		int a = scn.nextInt();
		System.out.println("enter second number");
		int b = scn.nextInt();
		int count = 0;
		
		for(int i = b;i>=a;i--)
		{
         	 isArmstrong(i);
         	 System.out.println(i);
         	 count++;
          	 break;
		}
		
		

	}

}



