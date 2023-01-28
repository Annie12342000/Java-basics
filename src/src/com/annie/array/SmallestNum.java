package com.annie.array;

public class SmallestNum {

	public static void main(String[] args) {
		int [] a = {3,5,4,7,8};
       int smallest = a[0];
       for(int i = 1; i<a.length;i++)
       {
    	   if (a[i] < smallest)
    		   smallest = a[i];
    	   
       }
        System.out.println("smallest =" +smallest);
	}

}
