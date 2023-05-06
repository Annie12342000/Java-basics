package com.annie;

public class Numbers {

}


	public static void main(String[] args)
	{
		System.out.println("Welcome to my Menu Driven Software: ");
		
		for(;;)
		{
			System.out.println("1. Factorial\n"
					+ "2. Length of a Number\n"
					+ "3. Power of a Number\n"
					+ "4. ArmStrong of a Number\n"
					+ "5. Strong Number\n"
					+ "6. Range of Armstrong Numbers\n"
					+ "7. Range of Strong Numbers\n"
					+ "8. Prime Numbers");
			
			java.util.Scanner scn = new java.util.Scanner(System.in);
			java.lang.Math;
			System.out.println("Enter your choice: ");
			int choice = scn.nextInt();
			
			if(choice==1)
			{
				System.out.println("Factorial of a Number: ");
				System.out.println("Enter the number: ");
				int num = scn.nextInt();
				
				if(num<0) System.out.println("No Negatives");
				else
				{
					System.out.println(num + " != " + Annie.factorial(num));
				}
			}
			else if(choice==2)
			{
				System.out.println("Length of a Number");
				System.out.println("Enter the number: ");
				int num = scn.nextInt();
				
				System.out.println("The Length of " + num + " is " + Annie.length(num));
				
			}
			else if(choice==3)
			{
				System.out.println("Power of a NUmber");
				System.out.println("Enter the Base: ");
				int base = scn.nextInt();
				
				System.out.println("Enter the Exponent: ");
				int exp = scn.nextInt();
				
				System.out.println("The power is " + Math.power(base, exp));
				
			}
			else if(choice==4)
			{
				System.out.println("ArmStrong of a Number: ");
				System.out.println("Enter the Number: ");
				int num = scn.nextInt();
				
				int result = Annie.armStrong(num);
				
				if(num==result) System.out.println("It is ArmStrong");
				else System.out.println("It is not ArmStrong");
			}
			else if(choice==5)
			{
				System.out.println("Strong of a Number");
				System.out.println("Enter the Number: ");
				int num = scn.nextInt();
				
				long result = Annie.strong(num);
				
				if(num==result) System.out.println("It is Strong");
				else System.out.println("It is not Strong");
				
			}
			else if(choice==6)
			{
				System.out.println("Range of ArmStrong");
				System.out.println("Enter the Ending Range: ");
				int range = scn.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i==.armStrong(i)) 
						System.out.println(i);
				}
			}
			else if(choice==7)
			{
				System.out.println("Range of Strong");
				System.out.println("Enter the Ending Range: ");
				int range = scn.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i==Annie.strong(i)) 
						System.out.println(i);
				}
			}
			else if(choice==8)
			{
				
			}
			else
			{
				System.out.println("Invalid Choice");
				System.out.println("Thats ok, Try again");
				System.out.println("Please Thank you...!");
			}
			
			System.out.println("Do you want to Continue : Y/N");
			char ch = scn.next().charAt(0);
			
			if(ch=='y' || ch=='Y') continue;
			else
			{
				System.out.println("Thats okay, Thank you for using the software");
				System.out.println("Visit Again...!");
				break;
			}
		}

	}

}
