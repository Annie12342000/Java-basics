import java.util.Scanner;
class currency 
{
	public static void main(String[] args) 
	{
		System.out.println("amount:");
		int amt=new Scanner(System.in).nextInt();
		if(amt>=2000){
			System.out.println("2000 x"+(amt/2000));
			amt%=2000;
		}
		if(amt>=500){
			System.out.println("500 x"+(amt/500));
			amt%=500;
		}
		if(amt>=100){
			System.out.println("100 x"+(amt/100));
			amt%=100;
		}
	}
}
