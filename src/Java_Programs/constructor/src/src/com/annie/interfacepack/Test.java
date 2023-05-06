package com.annie.interfacepack;
interface M
{
	void m1();
	void m2();
	
}

interface N
{
	void m1();
	void m3();
	
}

class D implements M,N
{
  @Override
   public void m1()
   {
	  System.out.println("m1() implemented for class A");
  }
  @Override
  public void m2()
  {
	  System.out.println("m2() implemented for class A");
  }
  @Override 
  public void m3()
  {
	  System.out.println("m3() implemented for class A");
  }
}
public class Test {

	public static void main(String[] args) {
		M mref = new M();
		mref.m1();
		mref.m2();
		
		N nref = new N();
		nref.m1();
		nref.m3();

	}

}
