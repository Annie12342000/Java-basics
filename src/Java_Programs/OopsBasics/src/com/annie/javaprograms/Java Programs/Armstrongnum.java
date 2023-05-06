import java.util.Scanner;
import java.lang.Math;

class ArmstrongNum 
{
	public static void main(String[] args) 
	{ 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scn.nextInt();
		int temp=num;
		int len=0;
		int rem=0;
		
		while(num>0){
			len++;
			num/=10;
			rem=num%10;
			System.out.println("length:"+len);
		}
		System.out.println("length:"+len);
		int sum=0;
		num=temp;
		while(num>0)
		{
		rem=num%10;
		System.out.println(rem);
        sum+=Math.pow(rem,len);
		System.out.println(sum);

			num/=10;
		
        
	}
	if(sum==temp)
System.out.print(temp+ "is an armstrong num");
	else
		System.out.print(temp+ "is not an armstrong num");
	}
}
