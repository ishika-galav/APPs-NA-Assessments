package com.java.mock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(5,7,2,1);
		
		List<Integer> reverse = list.stream().sorted((a,b) -> Integer.compare(b, a)).collect(Collectors.toList());
		
		System.out.println(reverse);

	}

}
