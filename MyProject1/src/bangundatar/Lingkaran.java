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

import java.util.Scanner;
public class Lingkaran {
    
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);

       double luas, phi=3.14;
       int r;
       
       System.out.print("Masukan Jari-jari : ");
       r=input.nextInt();
       
       luas=phi*r*r;
       System.out.println("Luas Lingkaran = "+luas);
    } 
}
