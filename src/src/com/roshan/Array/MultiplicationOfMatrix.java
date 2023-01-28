package com.roshan.Array;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b = {{3,2,3},{4,5,6},{7,8,9}};
		int[][]c = multiply(a,b);
		for(int [] t:c) {
			for(int n:t)  {
				System.out.print(n+ "\t");
			}
			System.out.println();
		}
	}
	static int [][] multiply(int[][]a,int [][]b){
		int len = a.length;
		int[][] c = new int [len][len];
		for(int i =0;i<len;i++) {
			for(int j =0;j<len;j++) {
				for(int k=0;k<3;k++) c[i][j]+=a[i][k]*b[k][j];
			}
		}
		return c ;
	} 
	
}
