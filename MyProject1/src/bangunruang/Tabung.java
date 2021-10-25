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
public class Tabung {
      
    //atribut
    public int volume;
    public int luas;
    
    //methods
    public void hitungVolume(){
        double r = 20;
        double t = 10;
        final double phi = 3.14;
        
        double volume = phi * r * r * t;
        System.out.println("Volume Tabung adalah :" + volume);
    }
    
    public void hitungLuas(){
        double phi = 3.14;
        double r = 2;
        final double t = 4;
        
        double luas = t * phi * r * r;
        System.out.println("Luas Selimut Tabung Adalah : " + luas);
    } 
}
