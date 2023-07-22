package com.java.interview;

public class Prog21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hey its \nishika \there ";
		
		int count = 0;
		boolean flag = false;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == ' ' || c== '\n' || c =='\t') {
				flag = false;
			}
			else if(!flag) {
				flag = true;
				count++;
			}
		}
		System.out.println(count);
		

	}

}
