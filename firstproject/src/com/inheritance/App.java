package com.inheritance;

public class App {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.age);
		p.walk();
		System.out.println();
		Student s=new Student();
		System.out.println(s.College);
		s.learn();
	}

}
