package com.java.practice;

public class ATM {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		double amount = 20.00;
		account.withdraw(amount);
		System.out.println("Cha-ching!");
		System.out.println(account.balance);
	}

}
