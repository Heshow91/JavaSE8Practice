package com.intertech.collectionsarraylist;

public class WrapperAndOverLoading {

		// Method 0
	  public void pickMe(Long x) { //will not be called
		  System.out.println("You Suck");
	  }
	    // Method A
	    public void pickMe(int x) {
	        System.out.println ("int");
	    }
	 
	    // Method B
	    public void pickMe(long x) {
	        System.out.println ("long");
	    }
	 
	    // Method C
	    public void pickMe(Integer x) {
	        System.out.println ("Integer");
	    }
	 
	    // Method D
	    public void pickMe(int... x) {
	        System.out.println ("int...");
	    }
	 
	    // Method E 
	    public void pickMe(long... x) {
	        System.out.println ("long...");
	    }
	    public void pickMe1(int[] myArray) {
	    }
	    // cannot have the same name
	    public void pickMe2(int... myVarargs) {
	    }
	    
	    public static void main(String[] args) {
	        WrapperAndOverLoading mp = new WrapperAndOverLoading();
	        int x = 5;
	        mp.pickMe(x); 
//	        ... the code "mp.pickMe(x)" would choose method A (exact primitive type) first, but 
//	        if that wasn't there, it would then choose method B (a larger primitive type).  
//	        Likewise if both A and B weren't there, it would then choose method C (the exact wrapper type). 
//	        Method D (varargs of the exact primitive type) would be the next option available, 
//	        followed by method E (varargs of a larger primitive type).
	    }  
	}

