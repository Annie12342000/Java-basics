package com.annie.string;

public class Withoutbuiltin {

	public static void main(String[] args) {
		String s1 = "java is an oops lang";
		char [] a = s1.toCharArray();
		String s2 =" ";
		int i = a.length-1; int j = a.length - 1;
		while(j>=0)
		{
			while(j>=0 && a[j]!= ' ')
			{
				j--;
			}
				String t=" ";
			    int k = j+1;
			    while(k<=i)
			    {
			    	t+=a[k];
			    	k++;
			    	
			    }
			    j--;
				i=j;
				s2= s2 +t  +" ";
				
		}
			System.out.println(s2);
	}

	}
