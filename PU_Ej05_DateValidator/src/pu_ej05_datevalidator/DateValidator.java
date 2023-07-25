/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pu_ej05_datevalidator;

/**
 *
 * @author nohyv
 */
public class DateValidator {
    
    public boolean validDate(int year, int month, int day) {
        if(year<1){
            System.out.println("Invalid year");
            return false;
        }
        
        if(month<1||month>12){
            System.out.println("Invalid month");
            return false;
        }
        
        if(day<1||day>daysInMonth(month,year)){
            System.out.println("Invalid day");
        }
        
        return true;
    }
    
    private int daysInMonth(int month, int year) {
        int days=0;
        
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days =31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if(isLeap(year)){
                    days=29;
                }else{
                    days=28;
                }
        }
        return days;
    }
    
    private boolean isLeap(int year) {
        if (year % 4 == 0) {
            return !(year % 100 == 0 && year % 400 != 0); 
        }
        return false;
    }
}

