package com.enthuware.test;

interface Account{
	public default String getId() {
		return "0000";
	}
}
public interface PremiumAccount extends Account {
//	static String getId(){
//	return "1111"; } //will not work
//	
	default String getId() {
		return "1111";
	}
//	//
//	String getId();
}
