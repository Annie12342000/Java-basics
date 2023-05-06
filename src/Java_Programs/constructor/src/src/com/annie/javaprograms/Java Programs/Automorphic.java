public class Automorphic Number
{ 
	public static int power(int base,int exp)
{
int result=1;
for(int i =1; i<=exp;i++)
 
{ 
	result= result*base;
}
return result;
}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
	}
}
