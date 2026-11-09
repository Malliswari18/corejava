package com.dcl;
import com.dcl.Fruit;
public class Apple extends Fruit {
	Apple(){
		super();
		System.out.println("Apple object is created");
	}
	public static void main(String[] args) {
		Apple a1=new Apple();
		System.out.println(a1.cost);
		a1.Ripe();
	}

}
