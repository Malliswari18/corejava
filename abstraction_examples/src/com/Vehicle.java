package com;

public abstract class Vehicle {
	void start() {
		System.out.print("Vehicle is Starting");
	}
	void stop() {
		System.out.println("Vehicle is stopping");
	}
	abstract void shiftGear();

}
