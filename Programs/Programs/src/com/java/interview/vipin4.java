package com.java.interview;

import java.util.Arrays;
import java.util.List;

public class vipin4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = Arrays.asList(3,5,8,11,9);
		
		int result = lst.stream().max(Integer:: compare).get();
		System.out.println(result);

	}

}
