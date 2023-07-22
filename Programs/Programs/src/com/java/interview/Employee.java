package com.java.interview;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	
	
	public void setEmployeeId(int id) {
		this.id = id;
	}
	public void setEmployeeName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return id;
	}
	public String getEmployeeName() {
		return name;
	}
	
	
	public Employee(int id, String name) {
		super();
		this.id =id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [Id = "+id+", Name = "+name+"]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}
