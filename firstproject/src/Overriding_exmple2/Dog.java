package Overriding_exmple2;

public class Dog extends Animal{
	@Override
	void move() {
		System.out.println("Dog is moving");
	}
	void bark() {
		System.out.println("Dog is barking");
	}

}
