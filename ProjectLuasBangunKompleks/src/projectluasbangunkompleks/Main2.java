/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Toshiba
 */
public class Main2 {
     public static void main (String args []) {
        
        double LingkaranA = Lingkaran.hitungLuas(14) / 2;
        double LingkaranB = Lingkaran.hitungLuas(7);
        
        double Luas = LingkaranA - LingkaranB;
        
        System.out.println("Luas : " + Luas);
    }
}