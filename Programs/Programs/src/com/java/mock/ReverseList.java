package com.java.mock;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("ACS","EPAM","ERR","TCS");
		
		List<String> res = list.stream().collect(Collectors.toList());
		Collections.reverse(res);
		
		res.forEach(System.out::println);
	}

}
