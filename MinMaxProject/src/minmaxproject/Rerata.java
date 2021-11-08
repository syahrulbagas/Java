/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Rerata {
    
    //array of integer -> data
    int [] dataBil = new int [100];
    
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Banyanya data (n) : ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukkan bil ke-" +(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    double hitungRerata(int [] data){
        double sum = 0;
        for(int i=0; i<this.n ; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
     int cariMin(int[] arr){
        int min = arr[0];
        for(int a=1;a>this.n;a++){
            if (min>arr[a]){
                min = arr[a];
            }
        }
        return min;
    }
    int cariMax(int[] arr){
        int max = arr[0];
        for(int a=1;a<this.n;a++){
            if (max<arr[a]){
                max = arr[a];
            }
        }
        return max;
    }
    void output(){
        System.out.println("Rerata : " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Min : " + this.cariMin(this.dataBil));
        System.out.println("Nilai Max : " + this.cariMax(this.dataBil));
    }
    
}
