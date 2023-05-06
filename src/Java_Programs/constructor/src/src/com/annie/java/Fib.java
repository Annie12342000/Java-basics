package com.annie.java;
import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("enter a number:");
        int a = 0, b = 1, c;
        for(int i = 1; i<=n; i++)
        {
        	System.out.println(a + "\t");
        	c=a+b;
        	a=b;
        	b=c;
        }
	}

}
