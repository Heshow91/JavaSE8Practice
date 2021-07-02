package com.enthuware.Test3;

public class HandlingExceptions2 {
	  public static void main(String args[]){
		  
	      try{
	          if (args.length == 0) return;
	          else throw new Exception("Some Exception");
	      }
	      catch(Exception e){
	          System.out.println("Exception in Main");
	      }
	      finally{
	          System.out.println("The end");
	      }
	   }
	}
