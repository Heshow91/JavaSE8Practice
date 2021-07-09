package com.enthuware.test5;

class X{
	public X() {
		System.out.println("In X");
	}
	
}
class Y extends X{
	public Y() {
		super();
		System.out.println("In Y");
	}
}

public class Contructors extends Y{
	public Contructors() {
		System.out.println("In Contructors");
	}
	public class Test{
		
		public void main(String[] args) {
			Y y = new Contructors();
		}
	}
	

}
