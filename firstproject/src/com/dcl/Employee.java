package com.dcl;

public class Employee {

	int salary=100000;
	 Employee() {
		System.out.println("Employee object created");
	}
	 void work() {
		 System.out.println("Employee is working");
	 }
	
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.salary);
		
		e1.work();
	}
}
