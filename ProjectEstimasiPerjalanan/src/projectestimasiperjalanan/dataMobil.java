/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectestimasiperjalanan;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class dataMobil {
    String [] mobil = {"A", "B", "C", "D", "E", "F"};
     String [] mobilJenis = {"Sedan", "SUV", "MPV"};
     int [] mobilJarak = {155, 535, 659, 530, 539, 431};
     String [] mobilAsal = {"Solo"};
     String [] mobilTujuan = {"Kudus", "Jakarta", "Banten", "Bandung", "Banyuwangi", "Jember"};
     double [] mobilKecepatan = {60, 65, 57, 62, 64, 53};
     Scanner idinput = new Scanner(System.in);
     double jarak;
     double waktu;
     int bahanBakar;
     int jml;
    
    public void ketMobil(){
        this.mobil[0] = "A";
        this.mobil[1] = "B";
        this.mobil[2] = "C";
        this.mobil[3] = "D";
        this.mobil[4] = "E";
        this.mobil[5] = "F";
    }
    
    public void lamaPerjalanan(){
        for(int i=0; i<6; i++){
            if("A" == this.mobil[i]){
                this.jarak = 155;
                this.waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Waktu mobil " + this.mobil[i] + " adalah " + String.format("%.2f", this.waktu) + " jam");
            }
            if("B" == this.mobil[i]){
                jarak = 535;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Waktu mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("C" == this.mobil[i]){
                jarak = 659;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Waktu mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("D" == this.mobil[i]){
                jarak = 530;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Waktu mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("E" == this.mobil[i]){
                jarak = 539;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Waktu mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
            if("F" == this.mobil[i]){
                jarak = 431;
                waktu = jarak/this.mobilKecepatan[i];
                System.out.println("Waktu mobil " + this.mobil[i] + " adalah " +String.format("%.2f", this.waktu) + " jam");
            }
                    
        }
    }
    
    
    public int bahanBakar(String x){
        for(int i=0; i<3; i++){
            if(x == "SEDAN"){
                this.bahanBakar = 10;
            }
            else if(x == "SUV"){
                this.bahanBakar = 12;
            }
            else if(x == "MPV"){
                this.bahanBakar = 14;
            }       
        }
        return bahanBakar;
    }
    
    public void jmlBBM(){
         for(int i=0; i<6; i++){
            if("A" == this.mobil[i]){
                this.jml = this.mobilJarak[i] * this.bahanBakar("SEDAN");
                System.out.println("Bahan bakar " + this.mobil[i] + " adalah " + this.jml);
            }
            else if("B" == this.mobil[i]){
                this.jml = this.mobilJarak[i] * this.bahanBakar("SEDAN");
                 System.out.println("Bahan bakar " + this.mobil[i] + " adalah " + this.jml);
            }
            else if("C" == this.mobil[i]){
                this.jml = this.mobilJarak[i] * this.bahanBakar("SUV");
                 System.out.println("Bahan bakar " + this.mobil[i] + " adalah " + this.jml);
            }
            else if("D" == this.mobil[i]){
                this.jml = this.mobilJarak[i] * this.bahanBakar("SUV");
                 System.out.println("Bahan bakar " + this.mobil[i] + " adalah " + this.jml);
            }
            else if("E" == this.mobil[i]){
                this.jml = this.mobilJarak[i] * this.bahanBakar("MPV");
                 System.out.println("Bahan bakar " + this.mobil[i] + " adalah " + this.jml);
            }
            else if("F" == this.mobil[i]){
                this.jml = this.mobilJarak[i] * this.bahanBakar("MPV");
                 System.out.println("Bahan bakar " + this.mobil[i] + " adalah " + this.jml);
            }   
        }
    }
    
}
