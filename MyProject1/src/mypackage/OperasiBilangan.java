/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Toshiba
 */
public class OperasiBilangan {
    
    //atribut
    public int bilPertama;
    public int bilKedua;
    
    //methods
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil Penjumlahannya adalah : " + hasil);
}
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil Pengurangannya adalah : " + hasil);
    }
    
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil Perkaliannya adalah : " + hasil);
    }
    
    public void hitungPembagian(){
        double hasil = bilPertama / bilKedua;
        System.out.println("Hasil Pembagiannya adalah : " + hasil);
    }
}
