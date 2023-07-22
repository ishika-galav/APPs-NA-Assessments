package com.java.interview;

public class Prog38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ishika";
		
		boolean flag = true;
		
		for(char i : str.toCharArray()) {
			if(str.indexOf(i)== str.lastIndexOf(i)) {
				System.out.println("First non- repeating character is: " + i);
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("No repeating character");
		}

	}

}
