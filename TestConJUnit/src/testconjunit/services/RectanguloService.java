/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconjunit.services;

import testconjunit.entities.Rectangulo;

/**
 *
 * @author nohyv
 */
public class RectanguloService {
    public double calcularArea(Rectangulo r){
        return r.getAncho()*r.getLargo();
    }
    
    public double calcularPerimetro(Rectangulo r){
        return 2*(r.getAncho()+r.getLargo());
    }
}