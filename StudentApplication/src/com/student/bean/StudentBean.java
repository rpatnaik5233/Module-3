package com.student.bean;

import java.time.LocalDate;


public class StudentBean 
{

	private int studentId;
	private String studentName;
	private LocalDate studentDob;
	
	public StudentBean() {
		super();
	}

	public StudentBean(int studentId, String studentName, LocalDate studentDob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDob = studentDob;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(LocalDate studentDob) {
		this.studentDob = studentDob;
	}

	@Override
	public String toString() {
		return "StudentBean [studentId=" + studentId + ", studentName="
				+ studentName + ", studentDob=" + studentDob + "]";
	}
	
	
}
