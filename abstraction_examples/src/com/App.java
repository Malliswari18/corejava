package com;

public class App {
	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar();
		ec.openBoot();
		ec.shiftGear();
		ec.stop();
		ec.start();
		System.out.println();
		/*UPCASTING*/
		Car c=new ElectricCar();
		c.openBoot();
		c.start();
		c.stop();
		c.shiftGear();
		System.out.println();
		Vehicle v1=new ElectricCar();
		v1.start();
		v1.stop();
		v1.shiftGear();
	
		
	}

}
