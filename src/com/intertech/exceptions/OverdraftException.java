package com.intertech.exceptions;

public class OverdraftException extends Exception {
	public OverdraftException(String message) {
		super(message);
	}
	public void withdraw(double amount) throws OverdraftException{
		double balance = 100;
		if(balance - amount < 0){
			throw new OverdraftException("Insufficient Funds");
		}
	}

}
