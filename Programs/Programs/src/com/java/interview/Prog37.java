package com.java.interview;

public class Prog37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ishika";
		int count =0;
		
		for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
		
		System.out.println("Total vowels are:" + count);

	}

}
