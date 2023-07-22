package com.java.interview;

import java.util.HashMap;

public class Prog19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="capgemini training";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		hm.put('a', 0);
		hm.put('e', 0);
		hm.put('i', 0);
		hm.put('o', 0);
		hm.put('u', 0);
		
		for(int i =0 ;i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				hm.put('a', hm.get('a')+1);
			}
			if(str.charAt(i)=='e') {
				hm.put('e', hm.get('e')+1);
			}
			if(str.charAt(i)=='i') {
				hm.put('i', hm.get('i')+1);
			}
			if(str.charAt(i)=='o') {
				hm.put('o', hm.get('o')+1);
			}
			if(str.charAt(i)=='u') {
				hm.put('u', hm.get('u')+1);
			}
		}
		System.out.println(hm);
	}

}
