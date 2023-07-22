package com.java.appsNA.practice;

public class StringDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "capgemini";
		 int len = str.length();
		 int n = 3, index =0; 
		 
		 String res[] = new String[n];
		 
		 for(int i=0; i<len; i=i+(len/n)) {
			 String ans = str.substring(i, i+(len/n));
			 res[index] = ans;
			 index++;
		 }
		 
		 for(String st : res) {
			 System.out.println(st);
		 }

	}

}
