package com.java.interview;

public class Student {
	
	private int studentId;
	private String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public Student(int id, String name) {
		super();
		this.studentId = id;
		this.studentName = name;
	}

	@Override
	public String toString() {
		return "studentId= "+studentId+" studentName = "+studentName+"]" ;
	}
	
	
	
	

}
