/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */
//Make class
class Buku {
//    make variable private
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;
    
    public Buku(String judul, String pengarang, String penerbit, int tahun ) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public void cetakBuku () {
        System.out.println(" Judul : " + judul);
        System.out.println(" Pengarang : " + pengarang);
        System.out.println(" Penerbit : " + penerbit);
        System.out.println(" Tahun : " + tahun);
    }
}
public class BukuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buku Demobuku1 =  new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007); 
        Demobuku1.cetakBuku();
        
        Buku Demobuku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004); 
        Demobuku2.cetakBuku();
    }
}
