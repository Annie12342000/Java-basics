package com.annie.array;

public class Diagonal {

//	public static int difference(int [][] a, int n) {
//		//int [][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
//		int sum1 = 0 , sum2 = 0, l = a.length;
//		
//		for(int i = 0; i<l; i++)
//		{
//			for(int j = 0; j < l;j++)
//			{
//			if(i==j)
//				sum1 += a[i][j];
//			if(i==l-j-1)
//				sum2 += a[i][j];
//			}
//			
//		}
//		return Math.abs(sum1 - sum2);
//	}
//	
	public static void main(String[] args) {
		//int n = 3;
		int [][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		int sum1 = 0 , sum2 = 0, l = a.length;
		
		for(int i = 0; i<l; i++)
		{
			for(int j = 0; j < l;j++)
			{
			if(i==j)
				sum1 += a[i][j];
			if(i+j==l-1)
				sum2 += a[i][j];
			}
		}
//		int sum =0 , l = a.length;
//		
//		for(int i = 0; i<l; i++)
//		{
//			sum += a[i][i];
//			if(i==l/2 && l%2!=0) continue;
//				sum += a[i][l-i-1];
//		}
	System.out.println(sum1);
	System.out.println(sum2);
	}


}