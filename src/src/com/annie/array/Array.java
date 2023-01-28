package com.annie.array;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the row size:");
		int rowsize = scn.nextInt();
		System.out.println("enter the col size:");
		int colsize = scn.nextInt();
	    int [] [] a = new int [rowsize] [colsize];
	    for(int i = 0; i<a.length; i++)
	    {
	    	System.out.println("enter the value " +i+ "row");
	    
	    	for(int j = 0; j<a[i].length;j++)
	    	{
	    		a[i][j] = scn.nextInt();
	        }
	
	}
	    for(int i = 0; i<a.length; i++ )
	    {
	    	for(int j = 0; j<a[i].length; j++)
	    	{
	    		System.out.print(a[i][j] + " ");
	    		
	    	}
	    	System.out.println();
	    }
	}
}
