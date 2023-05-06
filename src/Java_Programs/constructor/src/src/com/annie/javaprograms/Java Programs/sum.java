import java.util.Scanner;
class sum 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("enter a number:");
		int n = scn.nextInt();
		int rem;
		int rev=0;
		int sum1=0;
		int sum2=0;
		System.out.println("before reverse of number:"+n);
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			sum2= sum2+rem;
			n=n/10;


	}
		
			System.out.println("after reverse of number:"+rev);
			System.out.println("sum of digits of after reverse of number:"+sum2);
			while(rev>0)

		{
			rem=rev%10;
			sum1=sum1+rem;
			rev=rev/10;
}
 System.out.println("sum of digits of before reverse of number:"+sum1);
           if (sum1==sum2)
           {
			   System.out.println("sum of digits of before reverse of number and after reverse of number are same");
           }
	}
	}