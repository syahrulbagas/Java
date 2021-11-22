/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerental;

/**
 *
 * @author Toshiba
 */
public class premium extends gold{
    private int bonusPulsa;
    
    int pulsa(){
        if ("M003".equals(this.id)){
            this.bonusPulsa = 5000;
        } else{
            this.bonusPulsa = 0;
        }
        return this.bonusPulsa;
    }
    
    void print(){
    if (anggota().contains(this.id)){
        System.out.println("ID Member       : " + this.id);
        System.out.println("Nama Member     : " + namaMember());
        System.out.println("Jenis Member    : " + jenis());
        System.out.println("Tanggal Pinjam  : " + this.tglPinjam + "-" + this.blnPinjam + "-" + this.thnPinjam) ;
        System.out.println("Jenis Member    : " + this.tglKembali + "-" + this.blnKembali + "-" + this.thnKembali);
        System.out.println("Lama Sewa       : " + lamaHari() + " hari");
        System.out.println("Total Sewa      : " + totalSewa());
        System.out.println("Jumlah Poin     : " + poin());
        if(!"M001".equals(this.id)){
            System.out.println("Jumlah Cashback : Rp" + cashback());
        }
        if("M003".equals(this.id)){
            System.out.println("Bonus Pulsa     : Rp" + pulsa());
        }
    } else {
            System.out.println("Data Tidak ada");
    }
        
    }
    
}
