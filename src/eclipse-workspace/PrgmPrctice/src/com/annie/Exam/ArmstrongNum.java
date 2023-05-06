package com.annie.Exam;


public class ArmstrongNum {
	public static boolean arm(int num) {
		int temp = num;// 153
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		int sum = 0;
		num = temp;
		while (num > 0) {
			int digit = num % 10;
			sum = sum +  (int)Math.pow(digit, count);
			num /= 10;
		}
		if (sum == temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int count=0;
		for(int i=10000;i>=1;i--) {
			if(arm(i)) {
				System.out.println(i);
				count++;
				System.out.println("count=" +count);
				break;
			}
		}
	}
}
