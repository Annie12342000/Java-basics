import java.util.Scanner;
class Count 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= scn.nextInt();
		int count=0;
		while(n>0)
		{

			n=n/10;
			count++;
	}
	System.out.println("number of digits:"+count);
}
}
