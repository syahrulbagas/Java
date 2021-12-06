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
public class Bola extends BangunRuang{
     public double r;
    
    public double hitungLuas() {
        return 4 * Math.PI * Math.pow(this.r, 2);
    }
    
    public double hitungVolume() {
        return 4 * Math.PI * Math.pow(this.r, 3) / 3;
    }
    
}
