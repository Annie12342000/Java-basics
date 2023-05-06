class Pattern 
{
	public static void main(String[] args) 
	{
		int number=10;
		for(int i=1;i<=number;i++){
			for(int j=1;j<2*number;j++){
				String value=(j > i && j<2*number-i)? "":"*";

		System.out.print(value);
	}
	System.out.println();
}
	}
}
