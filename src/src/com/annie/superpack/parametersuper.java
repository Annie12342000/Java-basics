package com.annie.superpack;
class H
{
	int i;
	 int j ;
	 public H()
	 {
		 
	 }
	 public H(int i, int j)
	 {
		 this.i = i;
		 this.j = j;
		 
	 }
	 public void displayH()
	 {
		 System.out.println(i + " " + j);
		 
	 }
}
	 class G extends H
	 {
		 int i;
		 int j ;
		 public G()
		 {}
		 
		 public G(int i, int j)
		 { 
			 super.i = i;
			 super.j = j;
			 this.i = i;
			 this.j = j;
		 }
	 public void displayG()
	 {
		 System.out.println(i + " " + j);
		 
	 }
	
}

 class parametersuper {
	public static void main(String[] args) {
		G b = new G(4, 6);
		b.displayH();
		b.displayG();
	}

}
