package com.java.appsNA.practice;

public class CountVowAndConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ishika";
		int vCount =0;
		int cCount =0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)=='u') {
				vCount++;
			}
			else {
				cCount++;
			}
		}
		System.out.println("Vowels are: " + vCount + " Consonents are: " + cCount);

	}

}
