/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pu_ej02_temperatureconverter;

/**
 *
 * @author nohyv
 */
public class TemperatureConverter {
    private double temperature;
    private char unit;
    
    //Constructor
    public TemperatureConverter(double temperature, char unit) {
        this.temperature = temperature;
        unit= Character.toUpperCase(unit);
        if(unit=='C'||unit=='F'||unit=='K'){
           this.unit = unit; 
        }
    }
    
    //Getters&Setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        unit= Character.toUpperCase(unit);
        if(unit=='C'||unit=='F'||unit=='K'){
           this.unit = unit; 
        }
    }
    
    //Methods
    public double convertToCelsius(){
        switch (unit) {
            case 'F': return (temperature-32)*5/9;
            case 'K': return temperature-273.15;
            case 'C': return temperature;
            default: return Double.NaN;
        }
    }
    
    public double convertToFahrenheit(){
        switch (unit) {
            case 'C': return (temperature*9/5)+32;
            case 'K': return temperature*9/5 - 459.67;
            case 'F': return temperature;
            default: return Double.NaN;
        }
    }
    
    public double convertToKelvin(){
        switch (unit) {
            case 'C': return temperature+273.15;
            case 'F': return (temperature+459.67)*5/9;
            case 'K': return temperature;
            default: return Double.NaN;
        }
    }
}
