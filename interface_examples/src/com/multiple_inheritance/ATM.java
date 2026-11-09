package com.multiple_inheritance;

public class ATM implements Bank{
	int balance=100000;
	@Override
	public void deposit(int amount) {
		System.out.println("Amount deposited  "+amount);
		balance=balance+amount;
		System.out.println("-------------");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Amount withdraw  "+amount);
		balance=balance-amount;
		System.out.println("-------------");
	}
		
	
	@Override
	public void checkBalance() {
		System.out.println("BAlance  "+balance);
		
		
	}
}
