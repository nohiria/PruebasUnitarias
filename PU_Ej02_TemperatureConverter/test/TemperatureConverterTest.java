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
import pu_ej02_temperatureconverter.TemperatureConverter;

/**
 *
 * @author nohyv
 */
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
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
    public void convertToCelsiusTest(){
        TemperatureConverter temperatureFahrenheit= new TemperatureConverter(86, 'F');
        TemperatureConverter temperatureKelvin= new TemperatureConverter(40, 'K');
        TemperatureConverter temperatureCelsius= new TemperatureConverter(10, 'C');
        
        assertEquals(30, temperatureFahrenheit.convertToCelsius(), 0.1); //86°F=30°C
        assertEquals(-233.15, temperatureKelvin.convertToCelsius(), 0.1);  //40°K=-233.15°C
        assertEquals(10, temperatureCelsius.convertToCelsius(), 0.1);  //10°C
    }
    
    @Test
    public void convertToFahrenheitTest(){
        TemperatureConverter temperatureCelsius= new TemperatureConverter(30, 'C');
        TemperatureConverter temperatureKelvin= new TemperatureConverter(259, 'K');
        TemperatureConverter temperatureFahrenheit= new TemperatureConverter(10, 'F');
        
        assertEquals(86, temperatureCelsius.convertToFahrenheit(), 0.1); //30°C=86°F
        assertEquals(6.53, temperatureKelvin.convertToFahrenheit(), 0.1); //259°K=6.53°F
        assertEquals(10, temperatureFahrenheit.convertToFahrenheit(), 0.1); //10°F
    }
    
    @Test
    public void convertToKelvinTest(){
        TemperatureConverter temperatureCelsius= new TemperatureConverter(-233.15, 'C');        
        TemperatureConverter temperatureFahrenheit= new TemperatureConverter(6.53, 'F');
        TemperatureConverter temperatureKelvin= new TemperatureConverter(10, 'K');
        
        assertEquals(40, temperatureCelsius.convertToKelvin(), 0.1); //-233-15°C=40°K
        assertEquals(259, temperatureFahrenheit.convertToKelvin(), 0.1); //6.53°F=259°K
        assertEquals(10, temperatureKelvin.convertToKelvin(), 0.1); //10°K
    }
    
    @Test
    public void invalidUnitTest(){
        TemperatureConverter temperature = new TemperatureConverter(10, 'X');
        //NaN expected, unit is invalid != 'C', 'F', 'K'
        assertTrue(Double.isNaN(temperature.convertToCelsius()));
        assertTrue(Double.isNaN(temperature.convertToFahrenheit()));
        assertTrue(Double.isNaN(temperature.convertToKelvin()));
    }
    
    @Test
    public void lowerCaseUnitTest(){
        TemperatureConverter temperatureFahrenheit= new TemperatureConverter(86, 'f');
        TemperatureConverter temperatureKelvin= new TemperatureConverter(40, 'k');
        TemperatureConverter temperatureCelsius= new TemperatureConverter(10, 'c');
        
        assertEquals(30, temperatureFahrenheit.convertToCelsius(), 0.1); //86°F=30°C
        assertEquals(-233.15, temperatureKelvin.convertToCelsius(), 0.1);  //40°K=-233.15°C
        assertEquals(10, temperatureCelsius.convertToCelsius(), 0.1);  //10°C
    }
}
