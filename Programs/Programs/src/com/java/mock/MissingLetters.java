package com.java.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(3,3,20);
		List<Integer> res = new ArrayList<>();
		
		for(int i =1; i<20; i++) {
			if(!list.contains(i)) {
				res.add(i);
			}
		}
		System.out.println(res);
		
	}

}
