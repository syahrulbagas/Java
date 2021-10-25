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
public class BolaMain {
    public static void main (String [] args){
        Bola volume = new Bola();
        volume.volume = 10;
        volume.volume = 20;
        volume.hitungVolume();
        
        
        Bola luas = new Bola();
        luas.luas = 10;
        luas.hitungLuas();
    }
}
