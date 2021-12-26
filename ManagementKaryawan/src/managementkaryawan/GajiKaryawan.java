/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementkaryawan;

/**
 *
 * @author Toshiba
 */
public class GajiKaryawan extends DataKaryawan{
    private int gajiPokok;
    private int totalTunjangan;
    private int tunjanganSuamiIstri;
    private int tunjanganPegawai;
    private int gajiKotor;
    private int gajiBersih;
    private int tunjanganAnak;
    private double pot;
    public int gapok(String x) {
        if("A".equals(x)){
            this.gajiPokok = 5000000;
        }
        else if("B".equals(x)){
            this.gajiPokok = 6000000;
        }
        else if("C".equals(x)){
            this.gajiPokok = 6000000;
        }
        return this.gajiPokok;
    }
     public int tunjanganSuamiIstri(String x, String y){
        if(x == "Menikah"){
            this.tunjanganSuamiIstri = gapok(y)*10/100;
            }
        return this.tunjanganSuamiIstri;
    }
    
    public int Pegawai(int x, String y){
        if(x > 30){
            this.tunjanganPegawai = gapok(y)*15/100;
            }
        return this.tunjanganPegawai;
    }
    
    public int tunjanganAnak(String x, String y, int z){
        if(x == "Menikah" && z > 0){
            this.tunjanganAnak = (gapok(y)*5/100)*z;
            }
        return this.tunjanganAnak;
    }
    
}
