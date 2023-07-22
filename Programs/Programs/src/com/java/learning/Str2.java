package com.java.learning;
import java.util.*;

public class Str2 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int english = sc.nextInt();
//		int science = sc.nextInt();
//		int maths = sc.nextInt();
//		
//		int percent = (english + maths + science)/3;
//		
//		System.out.println("percent is " + percent);
//		
//		if(percent>= 40 && english>=33 && science>=33 && maths>=33) {
//			System.out.println("Pass");
//		}
//		else
//			System.out.println("Fail");
		
		String str = "ishika is the best";
		String str2 = "";
		char ch;
		
		for(int i=0; i<str.length();i++) {
			ch = str.charAt(i);
			str2 = ch+str2;
		}
		System.out.println(str2);
		
//		String str = "Hello, you are most welcomed";
//		
//		StringBuilder st = new StringBuilder();
//		
//		st.append(str);
//		st.reverse();
//		
//		System.out.println(st);
		

	}

}