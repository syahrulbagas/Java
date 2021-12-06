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
public class Lingkaran extends BangunDatar{
    // atribut jari-jari
    public double r;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        return Math.PI * this.r * this.r;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	  return 2 * Math.PI * this.r;
    }
}