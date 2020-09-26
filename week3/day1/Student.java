package org.student;

import org.department.Department;

public class Student extends Department{
	
	String name = "Moorthi R";
	String dept = "ECE";
	int id = 25;
	
	public void studentName() {
		
		System.out.println("Student Name is " + name);

	}
	
	public void studentDept() {
		
		System.out.println("Student Dept is " + dept);

	}
	
	public void studentId() {
		
		System.out.println("Student ID is " + id);

	}

	public static void main(String[] args) {
	
		Student student = new Student();
		
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		
		student.deptName();
		
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
