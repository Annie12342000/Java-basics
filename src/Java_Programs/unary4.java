class  unary4
{
	public static void main(String[] args) 
	{
		int a = 34;
		int b = 21 ;
		int c = a++ + ++b;
		int d= (--a + --b + c--);
		int e = (a + +b + +c + d--);
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
