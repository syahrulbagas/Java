/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdegan;

/**
 *
 * @author Toshiba
 */
public class DegDegan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DegDegan");
        System.out.println("=====================================================================");
        ModalBuah m = new ModalBuah ();
        System.out.println("Jumlah Seluruh Degan  : " + m.hitungModalBuah (5000, 7500, 8300, 9100) + " Buah");
        
        ModalTruk t = new ModalTruk ();
        
        System.out.println("Jumlah Degan per Truk  : " + t.hitungJumlah (3000, 1.2)+ " Buah");
        System.out.println("Sehingga jumlah Truk yang dibutuhkan sekitar :" + m.hitungModalBuah (5000, 7500, 8300, 9100)/t.hitungJumlah (3000, 1.2)+ " Truk" );
        
        hargaJualBuah hargaJual = new hargaJualBuah ();
        
        System.out.println("");
        int jml1 = (int) (m.hitungModalBuah (5000)+m.hitungModalBuah (7500)+m.hitungModalBuah (8300)+m.hitungModalBuah (9100));
        System.out.println("Modal Untuk Membeli Degan Selama 1 Bulan Rp " + jml1 );
        
        int jml2 = (int) (t.hitungTruk(2,15)+t.hitungTruk(3,30)+t.hitungTruk(3,35)+t.hitungTruk(3,75));
        System.out.println("Modal Untuk biaya akomodasi Truk selama 1 Bulan Rp " + jml2 );
        System.out.println("");
        int jml3 = (int) (jml1 + jml2);
        
        int hargajual = (int) (jml3 + hargaJual.hitungUntung (15000000));
        System.out.println("Sehingga Total Modal ditambah keuntungan yang diinginkan (15.000.000) adalah Rp " + hargajual);
        int keinginanHargaJual = (int) (hargajual/m.hitungModalBuah (5000, 7500, 8300, 9100));
        System.out.println("Harga Jual Minimum per Buah adalah Rp " + keinginanHargaJual);
    }
    
}
