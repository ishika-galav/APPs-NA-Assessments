package com.java.appsNA.practice;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cappgemminiiii";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+ 1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
			
		}
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			if(mp.getValue()>1) {
				System.out.println(mp);
			}
		}

	}

}
