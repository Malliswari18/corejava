package com.dcl;
/* If we Print an Object reference VAriable , the toString()method is 
 * implicitly called, which returns a String representation
 * of the Object Address
 * FullyQualified ClassName@hexaDecimalrepresntationOfHashCode*/

public class Person {
	public static void main(String[] args) {
		//to string 
		Person p=new Person();
		System.out.println(p);
		System.out.println(p.toString());
	}

}
