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
public class MyClass {
    public static void main(String [] args){
        OperasiBilangan op1 = new OperasiBilangan();
        op1.bilPertama = 100;
        op1.bilKedua = 150;
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        
        OperasiBilangan op2 = new OperasiBilangan();
        op2.bilPertama = 100;
        op2.bilKedua = 150;
        op2.hitungPenjumlahan();
        op2.hitungPengurangan();
        
        OperasiBilangan op3 = new OperasiBilangan();
        op3.bilPertama = 100;
        op3.bilKedua = 150;
        op3.hitungPerkalian();
        
        OperasiBilangan op4 = new OperasiBilangan();
        op4.bilPertama = 100;
        op4.bilKedua = 150;
        op4.hitungPembagian();
    }
}
