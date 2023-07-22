package com.java.learning;

import java.util.Scanner;

public class stringpro {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int i = s.length()-1 ;
		String res="";
		
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ')i--;
			int j=i;
			//if(i<0) break;
			while(i>=0 && s.charAt(i)!=' ')i--;
			if(res.isEmpty()) {
				res = res.concat(s.substring(i+1, j+1));
			}
			else
				res = res.concat(" "+ s.substring(i+1, j+1));
			
		}
		System.out.println(res);
	}
}
