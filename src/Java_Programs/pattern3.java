class pattern3 
{
	public static void main(String[] args) 
	{
	int number=7;
	for(int row=1;row<=number;row++)
		{
			for(int col=1; col<3*number-row;col++)
				{
					String value= (col < row)? " ":"*";
					System.out.print(value);
				}
			System.out.println();
		}
    
	}
}
