package com.annie.numbers;
import java.util.Scanner;


public class FactorsofNumber {

	public static void main(String[] args) {
		
     Scanner scn = new Scanner(System.in);
     System.out.println("enter a number:");
     int n = scn.nextInt();
     for(int i =1; i<=n; i++)
    	 if(n%i==0)
    	 System.out.println(i +" ");
     
     }

}
