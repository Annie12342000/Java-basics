package com.annie.numbers;
import java.util.Scanner;
public class PalindromRecur{
	public static int rev(int n,int temp)		//121,0			12 1, 1 12
	{
       if(n==0)
    	   return temp;		//0   --> 121
       
    	   int rem = n%10;				//rem = 121%10 = 1   , 2 , 1
    	   temp = (temp*10)+rem;			//temp = 1  , 12  , 121
    	   return rev( n/10,temp);			//12 1,  1 12 , 0 121
    	   
       }
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = scn.nextInt();
		int temp = rev(n,0);				//121,0
		
	  if(temp==n)
	   {
		   System.out.println("palindrome");
	   }
	  else
	   {
	   System.out.println("not p");
	   }

}
}