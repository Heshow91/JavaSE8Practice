package com.java.practice;

public class BankAccount {
	
	double balance = 150.00; //Instance Variable
	public void withdraw(double amount) { // amount is a local variable
		balance = balance - amount;
		
	}
	
}
