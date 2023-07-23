/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pu_ej03_passwordvalidator;

/**
 *
 * @author nohyv
 */
public class PasswordValidator {
    
    public static boolean isValid(String password){
        //Must be at least 8 characters.
        //Must contain at least one capital letter.
        //Must contain at least one lowercase letter.
        //Must contain at least one number.
        //Must contain at least one special character (for example, !@#$%^&*()-+=_).
        
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&*()\\-+=_]).{8,}$";
        
        return password.matches(regex);
    }
}
