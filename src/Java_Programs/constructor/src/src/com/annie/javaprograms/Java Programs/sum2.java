import java.util.Scanner;
class sum2 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the first value");
		int a = scn.nextInt();
		System.out.println("enter the last value");
		int b = scn.nextInt();
		int sum =0;
		for(int i=a;i<=b;i++){
			sum+=i;
			System.out.println(i);
		}
		System.out.println("the sum of given numbers:"+sum);
	}
}
