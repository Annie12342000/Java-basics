package com.annie.numbers;
import java.util.Scanner;
public class StrongRecursion {
	static int Factorial(int num)					//7
	{
		   if(num<=0)
		    return 1;
		   else
		   return num*Factorial(num-1);			//num = 7 , num-1 = 6 , 7* then 6
		}
	int sum=0;
	int check_StrongNumber(int num)
	{
	    int fact;
	    
	     if(num>0)
	     {
	         fact=1;
	         int rem=num%10;
	         check_StrongNumber(num/10);
	         fact=Factorial(rem);
	         sum+=fact;
	     }
	     return sum;
	     }	

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
	    int num;
	    System.out.print("Enter a number:");
	    num=cs.nextInt();
	    StrongRecursion ob=new StrongRecursion();
	    if(ob.check_StrongNumber(num)==num)
	    	System.out.print("It is a Strong Number.");
	       else
	    	   System.out.print("It is not a Strong Number.");
	    cs.close();
	}
}