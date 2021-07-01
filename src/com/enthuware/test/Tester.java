package com.enthuware.test;

public abstract class Tester{
	
abstract public void add() throws Exception;

    public static void main(String[] cacaca) throws Exception{
          int a = Integer.MAX_VALUE;
          int b = a;
          System.out.println( a+ "   "+b);
          
          int i = 1234567890;
          float f = i;
          System.out.println(i - (int)f);
          
          int h, l, m;
          h = l = m = 9;
          System.out.println(h);
          float f2 = 123.456_789F;
          System.out.println(f2);
          
        
    }
  
}