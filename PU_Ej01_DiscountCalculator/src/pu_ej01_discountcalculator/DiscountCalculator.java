/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pu_ej01_discountcalculator;

/**
 *
 * @author nohyv
 */
public class DiscountCalculator {
    public double calculateDiscount(double productPrice, double discountPercentage){
        double maxDiscountPercentage= 80;
        if(discountPercentage>maxDiscountPercentage||discountPercentage<0||productPrice<=0){
            return -1;
        }
        
        return productPrice*(discountPercentage/100);
    }
}
