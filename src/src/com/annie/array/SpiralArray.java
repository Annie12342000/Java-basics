package com.annie.array;

public class SpiralArray {

	public static void main(String[] args) {
		int [] [] a = spiral(7);
		for(int [] t:a)
		{
			for(int n:t)
			{
				System.out.println(n+ " \t ");
			}
			System.out.println();
		}
			System.out.println();
		}
		

	
	static int [] [] spiral(int size)
	{
		int [] [] a = new int [size][size];
	    int r = 0, c= -1;  //r =row     c=column
	    char m = 'r';
	    for(int i =1;i<size*size;i++)
	    {
	    	switch(m)
	    	{
	    	case 'r': c++;
	    	         a[r][c]=i;
	    	         if(c==size-1||a[r][c+1]!=0)
	    	        	 m = 'd';
	    	             break;
	    	             
	    	case 'd' : r++;
	    	          a[r][c]=i;
	    	          if(r==size-1||a[r+1][c]!=0)
	    	        	  m = 'l';
	    	              break;
	    	              
	    	case 'l' : c--;
	    	           a[r][c]=i;
	    	           if(c==0||a[r][c-1]!=0)
	    	        	   m = 'u';
	    	               break;
	    	               
	    	case 'u' : r--;
	    	           a[r][c] = i;
	    	           if(r==0||a[r-1][c]!=0)
	    	        	   m = 'r';
	    	               break;
	    	
	    	}
	    	
	    }
	    return a;
	}

}
