package com.java.appsNA.practice;

public class NegativePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num = 2, power = -2, res =1;
		
		power = Math.abs(power);
		
		for(int i=0; i<=power; i++) {
			res *= num;
		}
		
		res = 1/res;
		System.out.println(res);
		

	}

}
