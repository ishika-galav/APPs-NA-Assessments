package com.java.interview;

import java.util.HashMap;

public class CharFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hey its ishika here";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i= str.length()-1; i>=0; i--) {
			if(hm.containsKey(str.charAt(i))) {
				int count = hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++count);
			}
			else
				hm.put(str.charAt(i), 1);
		}
		
		System.out.println(hm);

	}

}
