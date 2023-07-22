package com.java.appsNA.practice;

public class FirstAndLastCapital {
	public static void main(String args[]) {
		
		String str = "hey its ishika here";
		
		String words[] = str.split(" ");
		
		String ans = "";
		
		for(String s: words) {
			char firstChar = Character.toUpperCase(s.charAt(0));
            char lastChar = Character.toUpperCase(s.charAt(s.length() - 1));
            String middlePart = s.substring(1, s.length() - 1).toLowerCase();
            
            ans += firstChar + middlePart + lastChar + " ";
 
		}
		
		
		System.out.println(ans);
	}

}
