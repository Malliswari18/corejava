package com.dcl;

class Car {
	private int cost=200000;
	private Car() {
		System.out.println("Car object is created");
	}
	private void Start() {
		System.out.println("car is starting");
	}
	public static void main(String[] args) {
		Car c1= new Car();
		System.out.println(c1.cost);
	}
	

}
