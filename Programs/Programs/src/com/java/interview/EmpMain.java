package com.java.interview;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmpMain implements Comparator<Employee> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Sudeep");
		Employee e2 = new Employee(2, "Ishika");
		
		Set<Employee> emp = new TreeSet<>();
		emp.add(e1);
		emp.add(e2);
		
		
		System.out.println(emp);

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

}
