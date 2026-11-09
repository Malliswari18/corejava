package com.multiple_inheritance;

public class Main {
	public static void main(String[] args) {
		Bank b=new ATM();
		
		b.deposit(10000);
		b.withdraw(2000);
		b.checkBalance();
		
	}

}
