package com.enthuware.test4;

public class UsingLoopConstructs{

    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
    
    public static void main(String[] args) {
        
        int index = 0;
        for(String day : days){
            
            if(index == 3){
                break;
            }else {
                // continue;
            }
            index++;
         //   System.out.println(days[index]);
            if(days[index].length()>3){
                days[index] = days[index].substring(0,3);
            }
           // System.out.println(days[0]);
        }
      //  System.out.println(index);
        System.out.println(days[index]);
        //for(String day: days){System.out.println(day);}

 
    }
}