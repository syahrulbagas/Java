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
public class Persegi extends BangunDatar {
    public double sisi;

    public double hitungLuas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 4 * this.sisi;
        return keliling;
    }
  
}
