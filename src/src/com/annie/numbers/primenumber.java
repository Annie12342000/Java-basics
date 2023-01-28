package com.annie.numbers;
import java.util.Scanner;


public class primenumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Intial Value:");
		int a = scn.nextInt();
		System.out.println("Final Value:");
		int b = scn.nextInt();
		boolean flag = true;

		for(int i =b; i>=a; i--)
		{
			flag= true;
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
				
			{System.out.println(i);
			break;
			
			}
		}
	}
		
}	
		

	


