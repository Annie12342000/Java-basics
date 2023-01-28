package com.annie.array;

public class ManualArray {

	public static void main(String[] args) {
		int[][] a = new int [3][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[1][0] = 20;
		a[2][0] = 30;
		
		
		for (int i = 0; i<a.length;i++)
		{
			for(int j = 0; j<a.length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
