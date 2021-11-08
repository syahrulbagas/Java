/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
import static java.util.Collections.binarySearch;
import java.util.ArrayList;

/**
 *
 * @author Toshiba
 */
public class array {
    ArrayList<String> data = new ArrayList<>();

    void tambahData() {
        Scanner tambah = new Scanner(System.in);
        System.out.println("Masukkan data string : ");
        data.add(tambah.nextLine());
        System.out.println("Daftar string dalam array list :" + data);
        tambah.nextLine();
    }

    void cariData() {
        Scanner cari = new Scanner(System.in);
        System.out.println("String yang mau dicari :");
        String mencari = cari.nextLine();
        if(binarySearch(data,mencari) > -1){
            System.out.println("String " + mencari + " ada di index ke " + binarySearch(data,mencari) +" di dalam data.");
        } else {
            System.out.println("String " + mencari + " tidak ada dalam data.");
        }
    }

    void hapusData() {
       Scanner hapus = new Scanner(System.in);
        System.out.println("String yang mau dihapus : ");
        String menghapus = hapus.nextLine();
        if(binarySearch(data,menghapus) > -1){
            data.remove(binarySearch(data,menghapus));
            System.out.println("String " + menghapus + " sudah dihapus di dalam data.");
        } else {
            System.out.println("String " + menghapus + " tidak ada dalam data.");
        } 
    }

    void tampilData() {
        System.out.println("Daftar string dalam array list :" + data);
        
    }

    static void print(String text) {
        System.out.println(text);
    }
    
}
