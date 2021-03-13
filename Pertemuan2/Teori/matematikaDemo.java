/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */

class matematika {
//    make variable
    int hasil = 0;
    int angka = 0;
//    METHOD    
    void pertambahan(int newAngka){
       hasil = angka + newAngka;
       System.out.println("\nPertambahan: "+ angka + " + " + newAngka + " = " + hasil);
    }
    void pengurangan(int newAngka) {
       hasil = angka - newAngka;
       System.out.println("\nPertambahan: "+ angka + " - " + newAngka + " = " + hasil);
    }
    void perkalian(int newAngka) {
       hasil = angka * newAngka;
       System.out.println("\nPertambahan: "+ angka + " * " + newAngka + " = " + hasil);
    }
    void pembagian(int newAngka) {
       hasil = angka / newAngka;
       System.out.println("\nPertambahan: "+ angka + " / " + newAngka + " = " + hasil);
    }
}

public class matematikaDemo {
//  Main Method
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        matematika operator = new matematika();
//        Operator penjumlahan
          operator.angka = 20;
          operator.pertambahan(20);
//        Operator pengurangan
          operator.angka = 10;
          operator.pengurangan(5);
//        Operator perkalian
          operator.angka = 10;
          operator.perkalian(20);
//        Operator pembagian
          operator.angka = 20;
          operator.pembagian(2);
    }
}

