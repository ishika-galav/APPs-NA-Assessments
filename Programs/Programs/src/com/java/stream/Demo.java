package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(4,5,1,6,9);
		

		
		int result = nums.stream()
			.filter(n->n%2==1) 
			.map(n->n*2)
			.reduce(0,(c,e)->(c+e));
		
		System.out.println(result);
		
		
		//Stream<Integer> data = nums.stream();
//		long count = data.count();
//		System.out.println(count);
		//data.forEach(n-> System.out.println(n));
//		
//		Stream<Integer> mappedData = data.map(n->n*2);
//		mappedData.forEach(n->System.out.println(n));
		
	}
}
