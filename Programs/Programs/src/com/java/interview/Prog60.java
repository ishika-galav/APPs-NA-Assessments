package com.java.interview;

import java.util.Scanner;

public class Prog60 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word = sc.nextLine();
		
//		str = str.replaceAll(word, "");
//		str.trim();
//		System.out.println(str);
		
		String arr[] = str.split(" ");
		String res = "";
		
		for(int i=0; i<arr.length; i++) {
			if(!word.equals(arr[i])) {
				res += arr[i]+ " "; 
			}
		}
		System.out.println(res);
		
		
	}
}
