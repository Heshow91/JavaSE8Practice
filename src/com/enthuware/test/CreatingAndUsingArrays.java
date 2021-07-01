package com.enthuware.test;

public class CreatingAndUsingArrays {

	public void initData(String[] arr) {
		int ind = 0;
		for (String str : arr) {
			System.out.println(str + " " + ind);
			ind++;
		}
	}

	public void printData(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		CreatingAndUsingArrays ap = new CreatingAndUsingArrays();
		String[] arr = new String[2];
		arr[0] = "element1";
		arr[1] = "element2";
		ap.initData(arr);
		ap.printData(arr);
	}
}
