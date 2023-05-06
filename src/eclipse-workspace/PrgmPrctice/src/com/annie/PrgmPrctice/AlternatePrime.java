package com.annie.PrgmPrctice;

import java.util.Scanner;

public class AlternatePrime {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Intial Value:");
		int a = scn.nextInt();
		System.out.println("Final Value:");
		int b = scn.nextInt();
		int count = 0;
		
		for(int i=a; i<=b; i++)
		{
			boolean flag= true;
			if(i<=1)continue;
			
			for(int j =2;j<=i/2;j++)
			{
				if(i%j==0)
				{ 
				flag =false;
				break;
				}
		    }
				
			if (flag) 
				
			{
				count++;
				if(count%2!=0)
				System.out.println(i);
			    
			
			}
	
	}

}
}
