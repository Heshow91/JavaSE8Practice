package com.intertech.interfacepractice;

public class PayService {
	public void cutCheck(Payable p) {
		double gross = p.pay();
	}
}
