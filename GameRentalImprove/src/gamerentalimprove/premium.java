/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerentalimprove;

/**
 *
 * @author Toshiba
 */
public class premium extends gold{
    private int bonusPulsa;
    dataMember data2 = new dataMember();
    
    public void pulsa(String x){
        if ("M003".equals(x)){
            this.bonusPulsa = 5000;
            System.out.println("Jumlah Pulsa    : " + this.bonusPulsa);
        } else{
            this.bonusPulsa = 0;
        }
        
    }

    void dataAnggota (String id, 
            String nama, 
            String jenis, 
            int tglPinjam, 
            int blnPinjam, 
            int thnPinjam, 
            int tglKembali, 
            int blmKembali, 
            int thnKembali, 
            int lamaHari, 
            int totalSewa, 
            int jmlPoin){
        if (anggota().contains(id)){
        System.out.println("ID Member       : " + id);
        System.out.println("Nama Member     : " + nama);
        System.out.println("Jenis Member    : " + jenis);
        System.out.print("Tanggal Pinjam  : ");
        System.out.print(tglPinjam);
        System.out.print("-");
        System.out.print(blnPinjam);
        System.out.print("-");
        System.out.println(thnPinjam);
        System.out.print("Tanggal Kembali : ");
        System.out.print(tglKembali);
        System.out.print("-");
        System.out.print(blmKembali);
        System.out.print("-");
        System.out.println(thnKembali);
        System.out.println("Lama Sewa       : " + lamaHari + " hari");
        System.out.println("Total Sewa      : " + totalSewa);
        System.out.println("Jumlah Poin     : " + jmlPoin);
        } else{
            System.out.println("Data tidak ada");
            
    }
    }
    
}
