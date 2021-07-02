package com.enthuware.Test3;

public class UsingStringBuilder {

	// TODO Auto-generated method stub
	private StringBuilder sb = new StringBuilder();

	public void logMsG(String location, String message) {
		sb.append(location);
		sb.append("-");
		sb.append(message);

	}

	public void dumpLog() {
		System.out.println(sb.toString());
		sb.delete(0, sb.length());

	}
	public static void main(String[] args) {
		System.out.println();
	}
}
