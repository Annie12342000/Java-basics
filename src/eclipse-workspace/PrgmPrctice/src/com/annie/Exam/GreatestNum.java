package com.annie.Exam;

import java.util.Scanner;

public class GreatestNum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter array elements:");
		int [] a = new int[5];
		
		for(int i = 0;i<=a.length;i++)
		{
			a[i] = scn.nextInt(); 
		}
			
			int	max = a[0];
			for(int j = 1;j<=a.length;j++)
			{
				if(max<a[j])
				{
					max=a[j];
				
			    }
		    }
		System.out.println("Greatest number=" +max);
	}

}
