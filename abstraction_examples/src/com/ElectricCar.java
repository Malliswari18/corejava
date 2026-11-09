package com;

public abstract  class ElectricCar extends Car {
	@Override
	void ShiftGear() {
		System.out.println("SHifting gear");
	}
	@Override
	void openBoot() {
		System.out.println("Opening boot space");
	}
	

}
