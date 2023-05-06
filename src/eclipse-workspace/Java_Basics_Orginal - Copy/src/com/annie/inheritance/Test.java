package com.annie.inheritance;
import java.util.Scanner;

class Bank
{
	public double rateOfInterest()
	{
		return 0.0;
	}
}
 class SBI extends Bank
 {  @Override
	public double rateOfInterest()
	 {
		 return 0.2;
		 
	 }
 }
 class AXIS extends Bank
 {   @Override
	 public double rateOfInterest()
	 {
		 return 0.3;
		 
	 }
 }
 class HDFC extends Bank
 {   @Override
	 public double rateOfInterest()
 {
	 return 0.5;
 }
 }
 
 class Salesman
 {
	 
	 public void salesForLoans(Bank bank,double amount)
	 {
		 double rateOfInterest = bank.rateOfInterest();
		 double roiAmount = amount * rateOfInterest;
		 int percent = (int) (rateOfInterest*100);
		 System.out.println(percent + "% is the percentage of interest for the amount " + amount);
		 System.out.println(roiAmount + " is the rate of interest to be paid");
		 double totalAmount =  amount + roiAmount;
		 System.out.println("The total amount to be paid is:" + totalAmount);
		 
	 }
//	 public void salesForLoans(HDFC hdfc)
//	 {
//		 hdfc.rateOfInterest();
//		 
//	 }
//	 
//	 public void salesForLoans(SBI sbi)
//	 {
//		 sbi.rateOfInterest();
//		 
//	 }
//	 public void salesForLoans(AXIS axis)
//	 {
//		 axis.rateOfInterest();
//		 
//	 }
//	
	 
 }
public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amount = scan.nextDouble();
		
		Salesman sales = new Salesman();
		sales.salesForLoans(new HDFC(),amount);
		
		
	}

}
