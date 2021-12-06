/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectestimasiperjalanan;

/**
 *
 * @author Toshiba
 */
public class ProjectEstimasiPerjalanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dataMobil y = new dataMobil() {};
        System.out.println("Waktu yang dibutuh kan pada tiap mobil adalah :");
        y.lamaPerjalanan();
        System.out.println("Bahan bakar yang dibutuh kan pada tiap mobil adalah :");
        y.jmlBBM();
    }
    
}
