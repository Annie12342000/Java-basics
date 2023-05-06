class unary3 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 3;
		b= --a + a-- + a-- + --a + --a;
		System.out.println(a);
		System.out.println(b);
	}
}
