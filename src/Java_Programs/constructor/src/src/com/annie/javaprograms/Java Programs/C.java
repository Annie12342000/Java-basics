class C 
{
	static int i=1;
		public static void m1() 
	{
		
		System.out.println("m1 starts");
		
		System.out.println(C.i);
		System.out.println("m1 ends");

	}
	public static void main(String [] args)
	{
		C.m1();
		C.i=10;
		C.m1();
}
}
