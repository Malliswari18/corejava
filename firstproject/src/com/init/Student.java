package com.init;
 class Student {
int age;
Student(int a){
age=a;
}
public static void main(String[] args) {
	Student s1=new Student(20);
	System.out.println("Age:"+s1.age);
	Student s2=new Student(40);
	System.out.println("Age :"+ s2.age);
}
 }
