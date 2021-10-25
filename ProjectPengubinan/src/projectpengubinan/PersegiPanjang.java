/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author Toshiba
 */
class PersegiPanjang {
    // atribut
    int panjang;
    int lebar;
    
    // method
//    int hitungLuas(){
//        int luas = this.panjang * this.lebar;
//        return luas;
//    }
    
//    
//    // method
//    int hitungLuas(int panjang, int lebar){
//        int luas = panjang * lebar;
//        return luas;
//    }
    // method untuk mengalikan dua bilangan a dan b
    static int perkalian(int a, int b){
        int hasil = a * b;
        return hasil;
    }
    
    // method
    int hitungLuas(int panjang, int lebar){
        int luas = perkalian(panjang, lebar);
        return luas;
    }
}


