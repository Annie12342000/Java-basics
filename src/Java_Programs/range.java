import java.util.Scanner;
class fibrange 
{
	public static void main(String[] args) 
	{
		System.out.println("enter range:");
		Scanner scn= new Scanner(System.in);
		int l= scn.nextInt();
		int u = scn.nextInt();
		int a =0,b=1,c;
		while(a<=u){
			if(a>=1)System.out.println(a+"\t");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
