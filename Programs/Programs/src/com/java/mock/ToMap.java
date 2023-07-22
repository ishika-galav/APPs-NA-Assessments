package com.java.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "ishika");
		Employee e2 = new Employee(2, "sudeep");
		Employee e3 = new Employee(3, "raunak");
		Employee e4 = new Employee(4, "tapti");
		Employee e5 = new Employee(1, "Naksh");
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Map<Integer,List<String>> map = list.stream()
				                        .collect(Collectors.groupingBy(n->n.getId(), Collectors.mapping(n->n.getName(), Collectors.toList())));
		
		System.out.println(map);
	}

}
