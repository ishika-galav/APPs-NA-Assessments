package com.java.appsNA.practice;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 42;
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			while(num%i ==0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
		if(num>1) {
			System.out.print(num);
		}

	}

}
