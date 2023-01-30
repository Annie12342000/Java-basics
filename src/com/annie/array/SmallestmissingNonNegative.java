package com.annie.array;

import java.util.Arrays;

public class SmallestmissingNonNegative {
	
	public static void smallestnonneg(int [] a,int n )
	{
		int smNonNeg = 0;
		boolean [] b = new boolean [n+1];
		Arrays.fill(b, false);
		
		for(int i =0;i<n;i++)
		{
			if(a[i]>=0 && a[i]<n)
			{
				b[a[i]] = true;
			}
			while(b[smNonNeg])
			{
				smNonNeg++;
			}
			System.out.println(smNonNeg + " ");
		}
		
	}

	public static void main(String[] args) {
		int [] a = {1,3,0,2};
		int n = a.length;
		smallestnonneg(a,n);

	}

}
