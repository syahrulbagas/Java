/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class CariPythagoras {
    int satu = 1;
    int dua = 2;
    int tiga = 3;
    int empat = 4;
    int a;
    int b;
    int c;
    
    Scanner data = new Scanner(System.in);
 
    double rumus(int a, int b, int c){
        c = (a*a) + (b*b);
        return c;
    }
    
    double rumus(int a, int b){
        c = (a*a) + (b*b);
        return Math.sqrt(c);
    }
    
    double rumus2(int a, int c){
        b = (c*c) - (a*a);
        return Math.sqrt(b);
    }
    
    void input(){
        boolean cek = true;
        while(cek == true){
            System.out.print("Masukkan pilihan : ");
        int bil = data.nextInt();
        switch(bil){
            case 1: 
                System.out.print("Nilai a : ");
                a = data.nextInt();
                System.out.print("Nilai b : ");
                b = data.nextInt();
                System.out.print("Nilai c : ");
                c = data.nextInt();
                double hasil = rumus(a, b, c);
                if (Math.sqrt(hasil) == c){
                    System.out.println("Bilangan tersebut Pythagoras");
                } else{
                    System.out.println("Bilangan tersebut bukan Pythagoras");
                }
                break;
            case 2:
                System.out.print("Nilai a : ");
                a = data.nextInt();
                System.out.print("Nilai b : ");
                b = data.nextInt();
                System.out.println(rumus(a, b));
                break;
            case 3:
                System.out.print("Nilai a : ");
                a = data.nextInt();
                System.out.print("Nilai c : ");
                c = data.nextInt();
                System.out.println(rumus2(a, c));
                break;
            case 4:
                cek = false;
                break;
        }
        }
    }
}