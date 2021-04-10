/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

/**
 *
 * @author Raka Apritama
 */
public class Mobil {
    String warna;
    int tahun = 2001;
    
    public Mobil() {

    }
    
    public Mobil(String color, int thn) {
        this.warna = color;
        this.tahun = thn;
    }
    
    public String getwarna() {
        return warna;
    }
    public int gettahun() {
        return tahun;
    }
}
