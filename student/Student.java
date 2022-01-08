package org.student;

import org.department.Department;

public class Student extends Department {
	
	private void studentName(String name) {
		System.out.println("The name of the student is "+name);
	}
	
	private void studentDept() {
		System.out.println("The dept. is general Engineering");
	}
	
	public void studentId() {
		System.out.println("My id was 1241016111");
	}

	public static void main(String[] args) {
		
		Student details = new Student();
		
		details.collegeName("KIITS University");
		details.collegeCode();
		details.collegeRank();
		
		details.deptName("Electronics and Communications");
		
		details.studentName("Vishal Sahoo");
		details.studentDept();
		details.studentId();

	}

}
