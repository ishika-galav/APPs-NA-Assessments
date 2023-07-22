package com.java.interview;

public class Prog63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome";
		String res = "";
		
		for(int i=0; i<str.length();i++) {
			for(int j =0; j<2; j++) {
				res += str.charAt(i);
			}
		}
		System.out.println(res);

	}
}
