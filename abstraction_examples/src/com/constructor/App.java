package com.constructor;

public class App {
	public static void main(String[] args) {
		Apple a=new Apple();
		System.out.println(a.type);
		Mango m=new Mango();
		System.out.println(m.type);
		
	}

}
//Constructor chaining: Child constructors must call parent constructors (explicitly with super(...) or implicitly with super()).
//
//Inheritance: Apple and Mango inherit the type field from Fruit.
//
//Object creation order: Parent constructor runs first, then child constructor.