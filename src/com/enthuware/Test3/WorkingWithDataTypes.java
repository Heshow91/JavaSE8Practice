package com.enthuware.Test3;

public class WorkingWithDataTypes{
	   String a = "x";
	   static char b = 'x';
	   String  c = "x";
	   class Inner{
	      String  a = "y";
	      String  get(){
	         String c = "temp";
	         // Line 1
	         //c = "" +WorkingWithDataTypes.b;
	         //c = ""+b;
	         c = "" + WorkingWithDataTypes.this.a;
	         return c;
	      }
	   }

	   WorkingWithDataTypes() { 
	     System.out.println(  new Inner().get()  ); 
	   }

	   public static void main(String args[]) {  new WorkingWithDataTypes();  }
	}