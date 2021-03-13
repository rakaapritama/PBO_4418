/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */
//Make class Mobil2
class Mobil2 {
//   Make variable
    String warna;
    int tahunproduksi;
    boolean on = false ;
    int ubahGigi;
    
//    Method
    void HidupkanMobil() {
       on = true;
    }
    void MatikanMobil() {
        on = false;
    }
    void ChangeGigi(int newGigi) {
        ubahGigi = newGigi;
    }
}

public class MobilDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
//        Make object
        Mobil2 mobilku1 = new Mobil2();
        mobilku1.warna = " Hitam ";
        mobilku1.tahunproduksi = 2006 ;
        mobilku1.HidupkanMobil();
        mobilku1.ChangeGigi(1);

        Mobil2 mobilku2 = new Mobil2();
        mobilku2.warna = " Biru ";
        mobilku2.tahunproduksi = 2009 ;
        mobilku2.MatikanMobil();
        mobilku2.ChangeGigi(0);
        
        System.out.println(" Keadaan : " + mobilku1.on);
        System.out.println(" Warna : " + mobilku1.warna);
        System.out.println(" Tahun : " + mobilku1.tahunproduksi);
        System.out.println(" Ganti Gigi :  " + mobilku1.ubahGigi);
        System.out.println(" ");
        System.out.println(" Keadaan : " + mobilku2.on);
        System.out.println(" Warna : " + mobilku2.warna);
        System.out.println(" Tahun : " + mobilku2.tahunproduksi);
        System.out.println(" Ganti Gigi :  " + mobilku2.ubahGigi);
    }
}
