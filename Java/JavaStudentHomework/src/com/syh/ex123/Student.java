package com.syh.ex123;

public class Student {
	//ѧ������
	private String name;
	//ѧ������
	private int grade;
	
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}