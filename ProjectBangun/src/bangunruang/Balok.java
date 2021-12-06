/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Toshiba
 */
public class Balok extends BangunRuang{
    public double p,l,t;
    
    public double hitungLuas() {
        return (2 * p * l) + (2 * p * t) + (2 * l * t);
    }
    
    public double hitungVolume() {
        return p*l*t;
    }
    
}
