package com.annie.array;

public class Demo1 {

	public static void main(String[] args) {
    int [] a1 = {3,6,8};
    int [] a2 = {3,8,9,5};
    
    m1(a1);
    m1(a2);
	}
	static void m1 (int [] a)
	{
		for(int n :a)
	     System.out.println(n+ " ");
	} 
}
//    a[0] = 1;
//    a[1] = 2;
//    a[2] = 3;
//    a[3] = 4;
//    a[4] = 9;
//    int [] b = a;
//    b[0] = 45;
//    for(int n:a)
//    {
//    	System.out.println(n);
//    	
//    }
//	}

