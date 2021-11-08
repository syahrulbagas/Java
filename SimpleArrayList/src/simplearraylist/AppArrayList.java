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
 * @author Salman 
 */
public class AppArrayList {
     ArrayList<String> DATA = new ArrayList<>();
    
    void Tambahkan_Data() {
        Scanner tambahkan = new Scanner(System.in);
        print("Masukkan data string : ");
        DATA.add(tambahkan.nextLine());
        print("Daftar string dalam array list :" + DATA);
        tambahkan.nextLine();
    }
    void Mencari_Data() {
        Scanner carikan = new Scanner(System.in);
        print("Silahkan String yang mau dicari  ");
        String mencari = carikan.nextLine();
        if(binarySearch(DATA,mencari) > -1){
            print("String " + mencari + " ada di index ke " + binarySearch(DATA,mencari) +" di dalam data.");
        } else {
            print("String " + mencari + " tidak ada dalam data.");
        }
        
    }
    void Menghapus_Data() {
        Scanner menghapus = new Scanner(System.in);
        print("Silahkan String yang mau dihapus : ");
        String menghapuskan = menghapus.nextLine();
        if(binarySearch(DATA,menghapuskan) > -1){
            DATA.remove(binarySearch(DATA,menghapuskan));
            print("String " + menghapuskan + " sudah dihapus di dalam data.");
        } else {
            print("String " + menghapuskan + " tidak ada dalam data.");
        }
        
    }
    
    void Menampilkan_Data() {
        System.out.println("Daftar string dalam array list :" + DATA);
    }
    static void print(String text) {
        System.out.println(text);
    }
}

