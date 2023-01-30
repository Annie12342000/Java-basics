package com.annie.encapsulatepack;
import java.util.Scanner;

public class WatchDriver1 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		boolean r = true;
		Watch w = null;
		
		
		do
		{
			
		
		System.out.println("Add 1.Watch 2.Fetch 3.Price 4.Change color 5.Exit ");
		int n = s.nextInt();
		
		switch(n) {
		case 1 :
		{
			System.out.println("Enter watch name:");
			String name = s.next();
			System.out.println("Enter price:");
			double price = s.nextDouble();
			System.out.println("Enter color:");
			String color =  s.next();
			
			 w = new Watch(name,price,color);
			 
		}
		break;
		case 2:{
			if(w==null)
				System.out.println("No watch found");
			else {
				w.watchDetails();
				
			}
			
		}
		break;
		case 3 :
		{
			if(w==null)
				System.out.println("No price found");
			else
				System.out.println(w.getprice());
		}
		break;
		case 4 :
		{
			if (w==null)
			System.out.println("No color found");
			else {
				System.out.println("Enter color");
				String color = s.next();
				System.out.println("Previous color");
				System.out.println(w.getcolor());
				System.out.println("Modified color");
				w.setcolor(color);
				System.out.println(w.getcolor());
				
			}
		
		}
		break;
		case 5 :
		{
			r = false;
			System.out.println("Thank you visit again");
			
		}
		break;
		default:
		{
			System.out.println("Enter valid num");
			
		}
		break;
		}
		
		}
		while(r);
		
		
	}

}
