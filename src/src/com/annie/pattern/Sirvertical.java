package com.annie.pattern;

public class Sirvertical {

	public static void main(String[] args) {
		int n = 5;
		for (int i =1; i<=n ; i++)
		{ int a =0;
			for(int j =1;j<=n;j++) {
			if(j%2!=0) 
			{
				 int k = a+i;
					
					{
				    	System.out.print(k+ " ");
						a=a+10;
					}
			}
			else {
					int k = (n*j+1)-i;
		
			  System.out.print(k+ " ");
			
			
			}
			}
			System.out.println();
		}
		
		}
	}


