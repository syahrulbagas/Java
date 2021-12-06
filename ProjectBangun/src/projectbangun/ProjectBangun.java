/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;
import bangundatar.*;
import bangunruang.*;

/**
 *
 * @author Toshiba
 */
public class ProjectBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();
        
        System.out.println("Persegi | sisi = 5");
        p.sisi = 5;
        p.tampilHasil();
        System.out.println("====================================");
        
        System.out.println("Lingkaran | r = 7");
        l.r = 7;
        l.tampilHasil();
        System.out.println("====================================");
        
        System.out.println("Persegi Panjang | panjang = 10 | lebar = 15");
        pp.p = 10;
        pp.l = 15;
        pp.tampilHasil();
        System.out.println("====================================");
        
        Balok balok = new Balok();
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        
        System.out.println("Balok | p = 5 | l = 7 | t = 12");
        balok.p = 5;
        balok.l = 7;
        balok.t = 12;
        balok.hasil();
        System.out.println("====================================");
        
        System.out.println("Bola | r = 14");
        bola.r = 14;
        bola.hasil();
        System.out.println("====================================");
        
        System.out.println("Tabung | r = 21 | t = 25");
        tabung.r = 21;
        tabung.t = 25;
        tabung.hasil();
        System.out.println("====================================");
    }
}
