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
public class KerucutMain {
    public static void main (String [] args){
        Kerucut volume = new Kerucut();
        volume.volume = 10;
        volume.volume = 20;
        volume.hitungVolume();
        
        
        Kerucut luas = new Kerucut();
        luas.luas = 10;
        luas.hitungLuas();
    }
}
