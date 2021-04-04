/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Raka Apritama
 */
public class arraylistInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
           Sayur sayuran = new Sayur();
           System.out.println(sayuran.sayurSisa());

           sayuran.tambahSayur("Kol");
           sayuran.tambahSayur("Terong");
           sayuran.tambahSayur("Kangkung");
           System.out.println(sayuran.sayurSisa());

           sayuran.sayurGanti(0,"Wortel");
           System.out.println(sayuran.sayurSisa());

           sayuran.sayurBusuk(2);
           System.out.println(sayuran.sayurSisa());
    }
}

class Toko_Sayur {
      ArrayList<String> vegetable = new ArrayList<>();

      public Toko_Sayur(){

      }
      public void setSayur(ArrayList<String> vegetable) {
            this.vegetable = vegetable;
      }
      public ArrayList<String> getSayur(){
            return this.vegetable;
      }
} 

class Sayur extends Toko_Sayur {
      public void tambahSayur(String vegetable){
            super.getSayur().add(vegetable);
      }
      public String sayurBusuk(int index){
            return super.getSayur().remove(index);
      }
      public void sayurGanti(int index, String vegetable){
            super.getSayur().set(index, vegetable);
      }
      public ArrayList<String> sayurSisa(){
            return super.getSayur();
      }
}
