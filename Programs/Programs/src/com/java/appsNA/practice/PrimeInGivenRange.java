package com.java.appsNA.practice;

public class PrimeInGivenRange {
	
	public static boolean Prime(int a ) {
		if( a<=1) return false;
		
		for(int i =2; i*i<=a; i++) {
			if(a%i==0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1= 11, n2= 30;
		
		for(int a=n1; a<=n2; a++) {
			if(Prime(a)) {
				System.out.println(a);
			}
		}

	}


}
