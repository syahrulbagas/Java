/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementkaryawan;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author Toshiba
 */
public class DataKaryawan {
    private int pilihan;
    private int subPilihan;
    private int x;
    private String statusMenikah;
    Scanner input = new Scanner(System.in);
    List<String> kode = new ArrayList<String>();
    List<String> nama = new ArrayList<String>();
    List<String> tanggalLahir = new ArrayList<String>();
    List<Integer> usia = new ArrayList<Integer>();
    List<String> alamat = new ArrayList<String>();
    List<String> golongan = new ArrayList<String>();
    List<String> status = new ArrayList<String>();
    List<Integer> anak = new ArrayList<Integer>();
    DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    private String kumpData;
    private String dataGolongan;
    
    public void pilihan() throws ParseException{
        System.out.println("Menu Utama");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Exit Data");
        System.out.print("Menu Pilihan :");
        this.pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                tambahData();
                break;
            case 2:
                hapusData();
                break;
            case 3:
                cariData();
                break;
            case 4:
                lihatData();
                break;
            case 5:
                System.exit(0);
                break;
    } 
    }
    
    public void tambahData() throws ParseException{
        System.out.print("Masukkan Kode Karyawan             : ");
        kode.add(input.next());
        System.out.print("Masukkan Nama Karyawan             : ");
        nama.add(input.next());
        System.out.print("Masukkan Alamat Karyawan           : ");
        alamat.add(input.next());
        System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd): ");
        String tgl = input.next();
        tanggalLahir.add(tgl);
        usia.add(umur(tgl));        
        System.out.print("Masukkan Golongan (A/B/C/D)        : ");
        this.dataGolongan = input.next();
        golongan.add(this.dataGolongan);
        System.out.print("Masukkan Status Menikah (0/1)      : ");
        String optionMenikah = input.next();
        status.add(menikah(optionMenikah));
        if ("1".equals(optionMenikah)){
            System.out.print("Masukkan Jumlah Anak               : ");
            anak.add(input.nextInt());
        } else if("0".equals(optionMenikah)){
            anak.add(0);
        }  
        this.subMenu3();
    }
    
    public void hapusData() throws ParseException{
        System.out.print("Masukkan Kode Karyawan            : ");
        String kodeKar = input.next();
        for(int i=0; i<kode.size(); i++){
            if(kodeKar.equals(kode.get(i))){
                kode.remove(i);
                nama.remove(i);
                tanggalLahir.remove(i);
                usia.remove(i);
                alamat.remove(i);
                golongan.remove(i);
                status.remove(i);
                anak.remove(i);
            }else {
                System.out.println("Data tidak ada");}
        }
        this.x -=1;
        this.subMenu();
    }
    
    
    public void lihatData() throws ParseException{
        Formatter fmt = new Formatter();
        System.out.println("=================================DATA KARYAWAN=================================");
        System.out.println("----------------------------------------------------------------------------------------");        
        fmt.format("%5s %10s %7s %8s %20s %20s", "KODE", "NAMA KARYAWAN", "GOL", "USIA", "STATUS NIKAH", "JUMLAH ANAK");  
        System.out.println(fmt);
        System.out.println("----------------------------------------------------------------------------------------");        
        for(int i=0; i<kode.size(); i++){
            System.out.println(String.format("%5s %13s %7s %8s %20s %20s", kode.get(i), nama.get(i), golongan.get(i), usia.get(i), status.get(i), anak.get(i)));  
        }  
        System.out.println("----------------------------------------------------------------------------------------");        
        this.subMenu2();
    }
    
    
    public void cariData() throws ParseException{
        System.out.print("Masukkan Kode Karyawan:");
        String kodeKar = input.next();
        System.out.println("=================================");
        System.out.println("DATA PROFILE KRYAWAN");
        System.out.println("---------------------------------");        
        for (String element : kode){
            if(element.contains(kodeKar)){
                for(int i=0; i<kode.size(); i++){
                if(kodeKar.equals(kode.get(i))){
                    System.out.print("Kode Karyawan             : ");
                    System.out.println(kode.get(i));
                    System.out.print("Nama Karyawan             : ");
                    System.out.println(nama.get(i));
                    System.out.print("Golongan Karyawan         : ");
                    System.out.println(golongan.get(i));
                    System.out.print("Usia Karyawan             : ");
                    System.out.println(usia.get(i));
                    System.out.print("Status Menikah            : ");
                    System.out.println(status.get(i));
                    System.out.print("Jumlah Anak               : ");
                    System.out.println(anak.get(i));
                    System.out.println("---------------------------------");
                    System.out.print("Gaji Pokok                : ");
                    GajiKaryawan x = new GajiKaryawan();
                    System.out.println(x.gapok(golongan.get(i)));
                    System.out.print("Tunjangan Istri/Suami     : ");
                    System.out.println(x.tunjanganSuamiIstri(status.get(i), golongan.get(i)));
                    System.out.print("Tunjangan Pegawai         : ");
                    System.out.println(x.Pegawai(usia.get(i), golongan.get(i)));
                    System.out.print("Tunjangan Anak            : ");
                    System.out.println(x.tunjanganAnak(status.get(i), golongan.get(i), anak.get(i)));
                    int gapok = x.gapok(golongan.get(i));
                    int totalTunjangan = x.tunjanganSuamiIstri(status.get(i), golongan.get(i)) + x.Pegawai(usia.get(i), golongan.get(i)) + x.tunjanganAnak(status.get(i), golongan.get(i), anak.get(i));
                    System.out.print("Gaji Kotor               : ");
                    int gator = gapok + totalTunjangan;
                    System.out.println(gator);
                    System.out.print("Potongan                 : ");
                    double pot = gator*2.5/100;
                    System.out.println(pot);
                    System.out.print("Gaji Bersih              : ");
                    double gasih = gator - pot;
                    System.out.println(gasih);
                }
        } 
        }else {
                System.out.println("Data tidak ada");
    }
        this.subMenu3();
    }}
    
    
    public void subMenu() throws ParseException{
        System.out.println("Pilih SubMenu");
        System.out.println("1. Kembali ke menu utama");
        System.out.println("2. Hapus Data Kembali");
        System.out.println("Menu Pilihan      :");
        this.subPilihan = input.nextInt();
        if(this.subPilihan == 1){
            this.pilihan();
        } else if (this.subPilihan == 2){
            this.hapusData();
        }
    }
    public void subMenu3() throws ParseException{
        System.out.println("Pilih SubMenu");
        System.out.println("1. Kembali ke menu utama");
        System.out.println("2. Tambah Data Kembali");
        System.out.println("Menu Pilihan      :");
        this.subPilihan = input.nextInt();
        if(this.subPilihan == 1){
            this.pilihan();
        } else if (this.subPilihan == 2){
            this.tambahData();
        }
    }
    
    public void subMenu2() throws ParseException{
        System.out.println("Pilih SubMenu");
        System.out.println("1. Kembali ke menu utama");
        System.out.println("Menu Pilihan      :");
        this.subPilihan = input.nextInt();
        if(this.subPilihan == 1){
            this.pilihan();
        }
    }
    
    public int umur(String s) throws ParseException{
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
    Date d = sdf.parse(s);
    Calendar c = Calendar.getInstance();
    c.setTime(d);
    int tahun = c.get(Calendar.YEAR);
    int bulan = c.get(Calendar.MONTH) + 1;
    int tanggal = c.get(Calendar.DATE);
    LocalDate lahir = LocalDate.of(tahun, bulan, tanggal);
    LocalDate sekarang = LocalDate.now();
    Period usia = Period.between(lahir, sekarang);
    return usia.getYears();
    }
    
    public String menikah(String status){
        if("0".equals(status)){
            this.statusMenikah = "Belum Menikah";
        } else if ("1".equals(status)){
            this.statusMenikah = "Menikah";
        }
        return this.statusMenikah;
    }
}
