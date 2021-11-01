/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class GameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Input
        int random, tebak, jumlah;
        random = (int) (Math.random() * 100);
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!”");
        Scanner masukan = new Scanner(System.in);
        jumlah = 0;
 
        //Proses
        do {
            jumlah++;
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();
 
            //Output
            if (tebak > random) {
                System.out.println("Tebakan Terlalu Besar");
            } else if (tebak < random) {
                System.out.println("Tebakan Terlalu Kecil");
            } else {
                System.out.print("Yee Bilangan Tebakan Anda Benar!");
            }
        } while (tebak != random);
    }
    
}
