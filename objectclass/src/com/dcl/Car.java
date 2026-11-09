package com.dcl;
import com.dcl.Test;

/* Any class object can be Upcasted to Object class reference
 * As Object is the Super-most class in java*/
public class Car {
	public static void main(String[] args) {
		Object o1=new Car();
		Object o2=new Test();
		Object o3=new Thread();
		Object o4=new Demo();
		
	}

}
