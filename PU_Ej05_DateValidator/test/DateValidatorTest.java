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
import pu_ej05_datevalidator.DateValidator;

/**
 *
 * @author nohyv
 */
public class DateValidatorTest {
    private DateValidator validator;
    
    public DateValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validator= new DateValidator();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void validDateTest(){
        assertTrue(validator.validDate(2023, 2, 28)); //Valid date
    }
    
    @Test
    public void invalidDateTest(){
        //Invalid year
        assertFalse(validator.validDate(0,2,28)); 
        assertFalse(validator.validDate(-2023,2,28));
        //Invalid month
        assertFalse(validator.validDate(2012, 13, 3)); 
        assertFalse(validator.validDate(2012, 0, 3));
        //Invalid day
        assertFalse(validator.validDate(2012, 10, 34)); 
        assertFalse(validator.validDate(2012, 10, 0)); 
    }
    
    @Test
    public void leapYearTest(){
        // Test with invalid day for February in a non-leap year
        assertFalse(validator.validDate(2023, 2, 29));
        
        // Test with invalid day for February in a leap year
        assertFalse(validator.validDate(2024, 2, 30));
    }
}
