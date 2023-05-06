class unary 
{
	public static void main(String[] args) 
	{
		int a = 7;
		int b = 0;
		b= ++a + ++a + a++ + ++a + a++ + ++a;
		System.out.println(a);
		System.out.println(b);
	
	}
}
