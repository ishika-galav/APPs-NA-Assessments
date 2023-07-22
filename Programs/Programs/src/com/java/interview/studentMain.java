package com.java.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class studentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Ishika");
		Student s2 = new Student(2, "Sudeep");
		Student s3 = new Student(3, "Vipin");
		
		List<Student> lst = new ArrayList<>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		
		List<Student> res = lst.stream().sorted((o1,o2)-> o1.getStudentName().compareTo(o2.getStudentName())).collect(Collectors.toList());
		System.out.println(res);

	}

}
