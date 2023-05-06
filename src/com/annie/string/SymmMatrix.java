package com.annie.string;
import java.util.Scanner;

public class SymmMatrix {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int len1 = 3;
		int len2 = 3;
		int [] [] b = new int [len1][len2];
		for(int i = 0; i<len1;i++)
			{ 
			for(int j = 0; j<len2;j++)
			{
				b[i][j] = scn.nextInt();
			}
			System.out.println();
			}
			
			for(int i = 0; i<len1;i++)
			{ 
			for(int j = 0; j<len2;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
			}
			
			if(len1!=len2)
			{
				System.out.println("enter valid rows and cols");
			}
			else
			{
				boolean flag = true;
				for(int i = 0; i<len1;i++)
				{ 
				for(int j = 0; j<len2;j++)
				{
					if(b[i][j]!=b[j][i])
					flag = false;
					break;
						
				}
				if(flag)
				{
					System.out.println("symmetric");
				}
				else {
					System.out.println("not");
				}
			}
		}

}
}