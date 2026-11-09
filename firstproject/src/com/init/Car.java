package com.init;

 class Car {
	 static int cc=1000;//global static variable
	 int price=20000000;//global non-static variable
	 Car() {
		 int speed=400; //local variable
		 System.out.println(speed);
		 System.out.println(Car.cc);
		 System.out.println(price);
		 
	 }
	 public static void main(String[] args) {
		 Car c1=new Car();
	 }

}
