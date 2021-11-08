/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        array arrayList = new array();
        
        while(true){
            int in;
            System.out.println("Menu Data ArrayList");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih No Berapa : ");
            in = input.nextInt();
            
            switch(in){
                case 1:
                    arrayList.tambahData();
                    break;
                case 2:
                    arrayList.cariData();
                    break;
                case 3:
                    arrayList.hapusData();
                    break;
                case 4:
                    arrayList.tampilData();
                    break;
                case 5:
                    System.out.println("Keluar, Terima Kasih");
                    System.exit(0);
                    default:
                        System.out.println("");
            }
        }
    }
    static void print(String text) {
    System.out.println(text);
}
}
