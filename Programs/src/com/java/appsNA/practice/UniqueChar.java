package com.java.appsNA.practice;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ishhhika";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))){
				map.remove(str.charAt(i));
			}
			else
				map.put(str.charAt(i), 1);

	}
		System.out.println(map);

}
}