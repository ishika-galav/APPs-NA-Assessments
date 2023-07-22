package com.java.interview;

public class Prog61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sudeep";
		char ch = 'e';
		String res = "";
		
		for(int i=0; i<str.length();i++) {
			if(!(str.charAt(i)==ch)) {
				res+= str.charAt(i);
			}
		}
		System.out.println(res);
		

	}

}
