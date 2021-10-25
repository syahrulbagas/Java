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
public class TabungMain {
    public static void main (String [] args){
        Tabung volume = new Tabung();
        volume.volume = 10;
        volume.volume = 20;
        volume.hitungVolume();
        
        
        Tabung luas = new Tabung();
        luas.luas = 10;
        luas.hitungLuas();
    }
}
