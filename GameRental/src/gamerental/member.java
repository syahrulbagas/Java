/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerental;


import java.time.*;
import java.util.*;

/**
 *
 * @author Toshiba
 */
public class member extends GameRental {
    ArrayList<String> member = new ArrayList<>();
    ArrayList<String> namaMember = new ArrayList<>();
    ArrayList<String> jnisMember = new ArrayList<>();
    
    //Method Menghitung Lama Hari
    int lamaHari(){
        int x = this.thnKembali;
        int y = this.blnKembali;
        int z = this.tglKembali;
        int a = this.thnPinjam;
        int b = this.blnPinjam;
        int c = this.tglPinjam;
        LocalDate from = LocalDate.of(a, b, c);
        LocalDate to = LocalDate.of(x, y, z);
        Period selisih = Period.between(from, to);
        
        int bulan = selisih.getMonths();
        int hari = selisih.getDays();
        int tahun = selisih.getYears();
        
        int total =(tahun * 365) + (bulan * 30) + hari;
        
        return total;
    }
    
    int totalSewa(){
        if ("M001".equals(this.id)){
            this.totalSewa = (lamaHari() * 25000) - ((lamaHari() * 25000) * 1/100);
        } else if ("M002".equals(this.id)){
            this.totalSewa = (lamaHari() * 30000) - ((lamaHari() * 30000) * 2/100);
        } else if ("M003".equals(this.id)){
            this.totalSewa = (lamaHari() * 45000) - ((lamaHari() * 45000) * 3/100);
        }
        return this.totalSewa;
    }
    
    ArrayList anggota(){
        this.member.add("M001");
        this.member.add("M002");
        this.member.add("M003");
        return this.member;
    }
    
    ArrayList namaAnggota(){
        this.namaMember.add("Mr.X");
        this.namaMember.add("Mr.Y");
        this.namaMember.add("Mr.Z");
        return this.member;
    }
    
    ArrayList JenisMember(){
        this.jnisMember.add("Mr.X");
        this.jnisMember.add("Mr.Y");
        this.jnisMember.add("Mr.Z");
        return this.member;
    }

    String namaMember(){
        if ("M001".equals(this.id)){
            this.nama = "Mr.X";
        } else if ("M002".equals(this.id)){
            this.nama = "Mr.Y";
        } else if ("M003".equals(this.id)){
            this.nama = "Mr.Z";
        }
        return this.nama;
    }
    
    String jenis(){
        if ("M001".equals(this.id)){
            this.jenisMember = "Silver";
        } else if ("M002".equals(this.id)){
            this.jenisMember = "Gold";
        } else if ("M003".equals(this.id)){
            this.jenisMember = "Platinum";
        }
        return this.jenisMember;
    }
    
    int poin(){
        if ("M001".equals(this.id)){
            this.jmlpoin = lamaHari() * 1;
        } else if ("M002".equals(this.id)){
            this.jmlpoin = lamaHari() * 5;
        } else if ("M003".equals(this.id)){
            this.jmlpoin = lamaHari() * 10;
        } else{
            this.jmlpoin = 0;
        }
        return this.jmlpoin;
    }
    
}
