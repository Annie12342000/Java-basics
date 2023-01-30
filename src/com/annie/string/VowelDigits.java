package com.annie.string;
import java.util.Scanner;

public class VowelDigits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = scn.next();
		int v = 0;
		int d = 0;
		
		
		
		for(int i =0; i <s.length();i++) {
			char c = s.charAt(i);
			
		
		
		
		{
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				
			    v++;
			
			}
			    
			else if (c>='0' && c<='9')
			    	d++;
		}
		}
		
		System.out.println("total no. of vowels in string are:" +v);
		System.out.println("total no. of digits in string are:" +d);
		
	}
}



