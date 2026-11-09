package com.dcl;

public class Fruit {
	protected int cost=100;
	protected Fruit() {
		System.out.println("Fruit object is created");
	}
 void  Ripe() {
	 System.out.println("Fruit ig getting rippened");
		
		
	}
	public static void main(String[] args) {
		Fruit f1=new Fruit();
		f1.Ripe();
		
	}
	

}
