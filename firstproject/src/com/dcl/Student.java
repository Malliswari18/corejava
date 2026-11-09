package com.dcl;

public class Student {
//Accessing public java members inside the same Class
	
	public int age=19;
	public Student() {
		System.out.println("Student object is created");
	}
	public void learn() {
		System.out.println("Learning Java");
	}
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.age);
		s1.learn();
	}
}
