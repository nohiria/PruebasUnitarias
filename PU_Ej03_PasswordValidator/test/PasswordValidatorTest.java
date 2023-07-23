/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pu_ej03_passwordvalidator.PasswordValidator;

/**
 *
 * @author nohyv
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void validPasswordTest(){
        String password= "123abc@N";
        
        assertTrue(PasswordValidator.isValid(password));
    }

    public void invalidShortPasswordTest(){
        String password= "123@Abc";
        
        assertFalse(PasswordValidator.isValid(password));
    }
    
    public void invalidNoCapLettersTest(){
        String passWithoutCapLetters= "abc123@!";
        
        assertFalse(PasswordValidator.isValid(passWithoutCapLetters));
    }
    
    public void invalidNoNumbersTest(){
        String passWithoutNumbers= "abcdABC@";
        
        assertFalse(PasswordValidator.isValid(passWithoutNumbers));
    }
    
    public void invalidNoLowerLettersTest(){
        String passWithoutLowerLetters= "ABCD123@";
        
        assertFalse(PasswordValidator.isValid(passWithoutLowerLetters));
    }
    
    @Test
    public void invalidNoSpecCharsTest(){
        String passWithoutSpecChars= "abc123AB";
        
        assertFalse(PasswordValidator.isValid(passWithoutSpecChars));
    }
}
