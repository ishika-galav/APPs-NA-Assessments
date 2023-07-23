package com.java.appsNA.practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int n = String.valueOf(num).length();
		
		int sum = 0;
		
		while(num>0) {
			int r = num%10;
			sum += Math.pow(r, n);
			num/= 10;
		}
		if(sum==num) {
			System.out.println("Armstrong");
		}
		else System.out.println("Not Armstrong");

	}

}
