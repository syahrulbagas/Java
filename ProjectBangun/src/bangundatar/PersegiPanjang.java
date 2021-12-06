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
public class PersegiPanjang extends BangunDatar{
    public double p, l;
    
    public double hitungLuas() {
        return (this.p * this.l);
    }
    
    public double hitungKeliling() {
        return (2 * (this.p + this.l));
    }
}
