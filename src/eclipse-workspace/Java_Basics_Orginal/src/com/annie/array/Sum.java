package com.annie.array;

public class Sum {

	public static void main(String[] args) {
		int [] a = {3,7,5,9};
		String s = " ";
		int sum = 0;
		for(int i =0;i<a.length;i++)
		{
			sum = sum +a[i];
			s+=a[i];
			if(i<a.length-1)
				s+="+";
			
		}
		s=s+"="+sum;
		System.out.println(s);
		}
}

