package org.dcl;

public class Person {
	@Override
	public String toString() {
		return "HIstudent";
	}
	public String print() {
		return "Hello Students";
	}
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p);//IMplicitly calling to String()
		System.out.println(p.toString());//explicitly calling to String()
		
	}

}
