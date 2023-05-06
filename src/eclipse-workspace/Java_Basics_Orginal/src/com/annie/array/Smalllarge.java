package com.annie.array;

public class Smalllarge {

	public static void main(String[] args) {
		int [] a = {30,10,4,78,95,56};
		int l = a.length;
		
		for (int i = 0; i<l; i++)
		{
			for(int j = i+1;j<l;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
				    a[i]=a[j];
				    a[j]= temp;
			    }
		}
	}
    System.out.println("Smallest:"   +a[0]);
    System.out.println("second smallest:" +a[1]);
    System.out.println("largest:"   +a[l-1]);
    System.out.println("second largest:"    +a[l-2]);
    
}
}
