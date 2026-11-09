package com.dclexample;

public class Example {
	public static void main(String[] args) {
		/* 1.it prints am empty String*/
		String s1=new String();
		System.out.println(s1);
		/* 2.passing sequence of character in the constructor*/
		String s2=new String("dhee coding lab");
		System.out.println(s2);
		/* 3.Passing char[] in the constructor 
		 * and converting it to a string Object*/
		char[] c= {'j','a','v','a'};
		String s3=new String(c);
		System.out.println(s3);
		
	}

}
