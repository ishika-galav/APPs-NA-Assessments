package com.java.appsNA.practice;

public class ArmstrongInRange {
	
	public static boolean Armstrong(int val) {
		
		int sum =0;
		int len = String.valueOf(val).length();
		while(val>0) {
			int r = val%10;
			sum += Math.pow(r, len);
			val/= 10;
		}
		return sum == val;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1= 100, n2 = 200;
		
		for(int val =n1; val<=n2; val++) {
			if(Armstrong(val)) {
				System.out.println(val);
			}
		}

	}

}
