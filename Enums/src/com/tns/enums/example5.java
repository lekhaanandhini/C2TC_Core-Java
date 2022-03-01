package com.tns.enums;
class example5
   {  
     enum Day
        { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY }  
     public static void main(String args[])
        {  
            Day day=Day.FRIDAY;  
            switch(day){  
                   case SUNDAY:   
                        System.out.println("uffff, it's again a monady");  
                        break;  
                   case FRIDAY:   
                        System.out.println("Hurrah!!! It's a weekend");  
                        break;  
                   default:  
                        System.out.println("other day");  
                       }  
        }
    }