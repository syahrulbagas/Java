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
public class Persegi {
    //atribut
    
    public int sisi;
    
    //methods
    public void hitungLuas(){
        int hasil = sisi * sisi;
        System.out.println("Luas Persegi adalah : " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = sisi * sisi * sisi * sisi;
        System.out.println("Keliling Persegi adalah : " + hasil);
    }
}

