package com.annie;

public class Allnumbers {
	public static int prime (int n)
	{
		boolean flag = true;
	for(int i =2;i<=n/2;i++){
		if(n%i==0){
			System.out.println(n+"is not a prime number");
			flag=false;
			break;
}
	}

    if (flag)System.out.println(n+"is  a prime number");
    
}
	
	
	

}
