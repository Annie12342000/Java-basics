class pattern2 
{
	public static void main(String[] args) 
	{
	int number=10;
	for(int row=1;row<=number;row++)
		{
		for(int col=1; col<2*number;col++)
			{
				int value1= (col <=number)?col:2*number-col;
				String value= (col > row && col<2*number - row)? " ": " "+value1+" ";
				System.out.print(value);
			}
		System.out.println();
		}
    }
}

