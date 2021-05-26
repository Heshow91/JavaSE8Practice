package com.intertech.jss.polymorphism;

public class PayService {
	public void cutCheck(Employee e) {
		double gross = e.pay();
	}
}
