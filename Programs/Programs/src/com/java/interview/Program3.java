package com.java.interview;

import java.util.HashMap;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "capgemini";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i =0; i<str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) {
				int count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++count);
			}
			
		
			else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);

	}

}