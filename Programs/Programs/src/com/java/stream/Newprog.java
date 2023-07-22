package com.java.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;


public class Newprog {

	public static void main(String[] args) {
		
		//List<Integer> demo = Arrays.asList(12,45,7,99,17,52);
		
		
		//Starts with 1-----
		
//		demo.stream().map(n-> n.toString())
//		             .filter(n-> n.startsWith("1"))
//		             .forEach(n-> System.out.println(n));
//		
		
		//Find duplicates-----
		
//		Set<Integer> st = new HashSet<>();
//		
//		demo.stream()
//		  .filter(n->!st.add(n))
//		  .forEach(n-> System.out.println(n));
//			
	
		//Find first element-------
		
//		demo.stream().findFirst().ifPresent(n-> System.out.println(n));		
		
		
		//Find total elements
		
//		long total = demo.stream().count();
//		System.out.println(total);
		
		
		//Find max element
//		demo.stream().max(Integer:: compare).ifPresent(n-> System.out.println(n));
		
		
		//Print elements in descending order
//		demo.stream()
//		    .sorted(Comparator.reverseOrder())
//		    .forEach(n-> System.out.println(n));
		
		//demo.stream().min(Integer:: compare).ifPresent(n-> System.out.println(n));
		
//		List<Integer> avg = Arrays.asList(3,7,8,1,12,13);
//		
//		OptionalDouble res = avg.stream().mapToInt(n-> n).average();
//		System.out.println(res);
		
		
//		List<Integer> sort = Arrays.asList(14,1,27,89,20,-20);
//		
//		sort.stream().filter(n-> n>=0).sorted().forEach(n-> System.out.println(n));
//		
		
		
//		List<String> str = Arrays.asList("you","exe","ooo","xyz","zzz");
//		
//		str.stream().filter(n->n.).forEach(n->System.out.println(n));
//		
		//List<String> str = Arrays.asList("abc"," def","fgh","klm","akze");
		
		//str.stream().filter(n-> n.startsWith("a")).forEach(n-> System.out.println(n));
		
		
		List<Integer> lst = Arrays.asList(22,322,607,70);
		
		lst.stream().filter(n-> n.)
		
	}
}
