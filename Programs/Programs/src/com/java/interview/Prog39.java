package com.java.interview;

import java.util.Scanner;

public class Prog39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		boolean flag =true;
		
		char[] chr = str.toCharArray();
		
		int lngth = chr.length;
		
		for(int i=0; i<lngth; i++) {
			char ch = chr[i];
			if(ch >= 'a' && ch <= 'z'){
				System.out.println("Valid");
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Not Valid");	

	}

}}
