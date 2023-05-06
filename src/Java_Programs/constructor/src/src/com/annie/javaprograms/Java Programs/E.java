class E 
{
	public static void m1() 
	{
		System.out.println("m1 starts");
		System.out.println("m1 ends");
	}

public static void main(String[] args)
	{
	System.out.println("main starts");
	m1();
	m1();
	System.out.println("main ends");
	}
}