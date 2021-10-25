/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Toshiba
 */
public class Segitiga {
    static double sisiMiring(double a, double b) {
        return (Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
    
    double hitungLuasS(int alas, int tinggi) {
        return ((alas * tinggi) / 2);
    }
    
    double hitungLuasS(int alas, double tinggi) {
        return ((alas * tinggi) / 2);
    }
    
    double hitungLuasS(double alas, int tinggi) {
        return ((alas * tinggi) / 2);
    }
    
    double hitungLuasS(double alas, double tinggi) {
        return ((alas * tinggi) / 2);
    }
    
    //hitung keliling dengan segitiga dianggap segitiga sama kaki
    double hitungKelilingS(int alas, int tinggi) {
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
    double hitungKelilingS(int alas, double tinggi) {
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
    double hitungKelilingS(double alas, int tinggi) {
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
    double hitungKelilingS(double alas, double tinggi) {
        double SisiMiring = sisiMiring(alas, tinggi);
        return (alas + tinggi + SisiMiring);
    }
    
}
