package org.studentw3d1;

import org.departmentw3d1.Department;

public class Student extends Department {

public void studentName(String name) {
		
		System.out.println("Name is :" + name);
	}
	
	public void studentDept(String sdept) {
		
		System.out.println("Student dept is :" +sdept);
	}
	
	public void studentId(int id) {
		
		System.out.println("Student id is :" +id);
		
		
	}
	
	
	public static void main(String[] args) {
		
		Student myStudent = new Student();
		myStudent.collegeName("RMK");
		myStudent.collegeCode(1173);
		myStudent.collegeRank(7);
		myStudent.deptName("EEE");
		myStudent.studentDept("EEE");
		myStudent.studentName("Suganya");
		myStudent.studentId(5156);
		
	}
}
