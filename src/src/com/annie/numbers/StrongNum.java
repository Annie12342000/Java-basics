package com.annie.numbers;
import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		        int num,originalNum,rem,fact,sum=0;
		        Scanner scn = new Scanner(System.in);
		        System.out.println("Enter a number : ");
		        num=scn.nextInt();
		        originalNum=num;
		        while (num>0)//145>0  14>0 1>0
		        {
		            rem=num%10;
		            
		            fact=1;
		            for(int i=1;i<=rem;i++){
		                fact*=i;
		            }
		            
		            sum+=fact;
		            num=num/10;
		        }
		        if (sum == originalNum) {
		            System.out.println(originalNum + " is STRONG NUMBER");
		        } else {
		            System.out.println(originalNum + " is not a STRONG NUMBER");
		        }
		    }
		

	}


