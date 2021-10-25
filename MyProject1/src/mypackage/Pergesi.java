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
import java.util.Scanner;
public class Pergesi {
    
  public static void main(String[] args) {
    int sisi, luas;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi persegi: ");
    sisi = scan.nextInt();
    luas = sisi * sisi;
    System.out.println("Luas Persegi adalah " + luas);
  }
}