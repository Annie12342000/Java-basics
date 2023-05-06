package constructor;
class A
{ int i;
  A(int i )
  {
	  this.i=i;
  }
	}

public class Test {
 public static void main(String[] args) {
	 
	A a1=new A(25);
	System.out.println(a1.i);
	
	
}
}
