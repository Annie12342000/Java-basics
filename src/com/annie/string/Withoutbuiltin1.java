package com.annie.string;

public class Withoutbuiltin1 {

	public static void main(String[] args) {
		String s1 = "java is an oops lang";
		String s2 = " ";
		char[] a = s1.toCharArray();
		int i = 0; int j =0;
		while(i<a.length)
		{
			while(j<a.length && a[j]!=' ')
			{
				j++;
			}
			String t = " ";
			int k = j-1;
			while(k>=i)
			{
				t += a[k];
				k--;
			}
		    	j++;
				i=j;
				s2=s2 + t +" ";
				
			}
		
		System.out.println(s2);
	}
}

	