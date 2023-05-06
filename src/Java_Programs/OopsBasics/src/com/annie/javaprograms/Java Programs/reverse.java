import java.util.Scanner;
class reverse 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scn.nextInt();
		int reverse=0;
		int remainder;
		System.out.println("the number before reverse:"+num);
		while(num>0){
			remainder=num%10;
			
			reverse=(reverse*10)+remainder;
			num=num/10;
						System.out.println("reverse" +reverse);
		}
		System.out.println("the number after reverse:"+reverse);

	}
}
