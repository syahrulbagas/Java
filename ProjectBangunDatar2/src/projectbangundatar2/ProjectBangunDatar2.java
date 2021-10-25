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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas persegi panjang dengan panjang 10 dan lebar 5 adalah : " + pp.hitungLuasPP(10, 5));
        System.out.println("Luas persegi panjang dengan panjang 3.6 dan lebar 8 adalah : " + pp.hitungLuasPP(3.6, 8));
        System.out.println("Luas persegi panjang dengan panjang 6 dan lebar 8.3 adalah : " + pp.hitungLuasPP(6, 8.3));
        System.out.println("Luas persegi panjang dengan panjang 5.6 dan lebar 8.8 adalah : " + pp.hitungLuasPP(5.6, 8.8) + "\n");
        
        System.out.println("Keliling persegi panjang dengan panjang 10 dan lebar 5 adalah : " + pp.hitungKelilingPP(10, 5));
        System.out.println("Keliling persegi panjang dengan panjang 3.6 dan lebar 8 adalah : " + pp.hitungKelilingPP(3.6, 8));
        System.out.println("Keliling persegi panjang dengan panjang 6 dan lebar 8.3 adalah : " + pp.hitungKelilingPP(6, 8.3));
        System.out.println("Keliling persegi panjang dengan panjang 5.6 dan lebar 8.8 adalah : " + pp.hitungKelilingPP(5.6, 8.8));
        System.out.println("\n===================================================================================\n");
        
        Persegi persegi = new Persegi();
        System.out.println("Luas persegi dengan panjang sisi 4.5 adalah : " + persegi.hitungLuasP(4.5));
        System.out.println("Luas persegi dengan panjang sisi 7 adalah : " + persegi.hitungLuasP(7) + "\n");
        
        System.out.println("Keliling persegi dengan panjang sisi 4.5 adalah : " + persegi.hitungKelilingP(4.5));
        System.out.println("Keliling persegi dengan panjang sisi 7 adalah : " + persegi.hitungKelilingP(7));
        System.out.println("\n===================================================================================\n");
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas lingkaran dengan panjang jari - jari 5 adalah : " + lingkaran.hitungLuasL(5));
        System.out.println("Luas lingkaran dengan panjang jari - jari 7.4 adalah : " + lingkaran.hitungLuasL(7.4) + "\n");
        
        System.out.println("Keliling lingkaran dengan panjang jari - jari 5 adalah : " + lingkaran.hitungKelilingL(5));
        System.out.println("Keliling lingkaran dengan panjang jari - jari 7.4 adalah : " + lingkaran.hitungKelilingL(7.4));
        System.out.println("\n===================================================================================\n");
        
        Segitiga segitiga = new Segitiga();
        System.out.println("Luas segitiga dengan panjang alas 8 dan tinggi 10 adalah : " + segitiga.hitungLuasS(8, 10));
        System.out.println("Luas segitiga dengan panjang alas 8 dan tinggi 11.5 adalah : " + segitiga.hitungLuasS(8, 11.5));
        System.out.println("Luas segitiga dengan panjang alas 12.2 dan tinggi 9 adalah : " + segitiga.hitungLuasS(12.2, 9));
        System.out.println("Luas segitiga dengan panjang alas 13.9 dan tinggi 20.7 adalah : " + segitiga.hitungLuasS(13.9, 20.7) + "\n");
        
        System.out.println("Keliling segitiga dengan panjang alas 8 dan tinggi 10 adalah : " + segitiga.hitungKelilingS(8, 10));
        System.out.println("Keliling segitiga dengan panjang alas 8 dan tinggi 11.5 adalah : " + segitiga.hitungKelilingS(8, 11.5));
        System.out.println("Keliling segitiga dengan panjang alas 12.2 dan tinggi 9 adalah : " + segitiga.hitungKelilingS(12.2, 9));
        System.out.println("Keliling segitiga dengan panjang alas 13.9 dan tinggi 20.7 adalah : " + segitiga.hitungKelilingS(13.9, 20.7));
        System.out.println("\n===================================================================================\n");
    }
}

