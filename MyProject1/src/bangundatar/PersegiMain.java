/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Toshiba
 */
public class PersegiMain {
    public static void main (String [] args){
        Persegi luas = new Persegi();
        luas.sisi = 10;
        luas.hitungLuas();
        
        Persegi keliling = new Persegi();
        keliling.sisi = 20;
        keliling.hitungKeliling();
}
}
