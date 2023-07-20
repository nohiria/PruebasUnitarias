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
import pu_ej01_discountcalculator.DiscountCalculator;

/**
 *
 * @author nohyv
 */
public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
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
    public void testCalculateDiscount(){
        DiscountCalculator discount= new DiscountCalculator();
        assertEquals(10, discount.calculateDiscount(100,10),0); //10% discount
        assertEquals(0, discount.calculateDiscount(100,0),0); //No discount
        assertEquals(80, discount.calculateDiscount(100,80),0); //Max discount
        
        assertTrue(discount.calculateDiscount(100, 81)<0); //-1 expected, maximum discount is exceeded
        assertTrue(discount.calculateDiscount(100, -1)<0); //-1 expected, discount must be >=0 
        assertTrue(discount.calculateDiscount(0, 80)<0); //-1 expected,  product price must be >0
    }
}
