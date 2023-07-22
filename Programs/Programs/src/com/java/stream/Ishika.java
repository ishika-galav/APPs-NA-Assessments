package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ishika {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,6,9,5);
		
		Stream<Integer> stm = numbers.stream();
		
			
		Stream<Integer> mappedstm = stm.map(n -> n*2);
		mappedstm.forEach(n-> System.out.println(n));
		
//		for(int n : numbers) {
//			System.out.println(n*2);
//		}
		
		
	}
}