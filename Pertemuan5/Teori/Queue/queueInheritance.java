/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author Raka Apritama
 */
public class queueInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
            Sayur sayuran = new Sayur();
            System.out.println(sayuran.SayurSisa());
 
            sayuran.tambahSayur("Kangkung");
            sayuran.tambahSayur("Wortel");
            sayuran.tambahSayur("Sawi");
            sayuran.tambahSayur("Terong");
            sayuran.tambahSayur("Kol");
            System.out.println(sayuran.SayurSisa());
 
            sayuran.SayurBusuk(2);
            System.out.println(sayuran.SayurSisa());
    }
}
class Toko_Sayur {
      Queue<String> vegetable = new LinkedList<String>();
 
      public Toko_Sayur(){
 
      }
      public void setSayur(Queue<String> vegetable) {
            this.vegetable = vegetable;
      }
      public Queue<String> getSayur(){
            return this.vegetable;
      }
}

class Sayur extends Toko_Sayur {
      public void tambahSayur(String vegetable){
            super.getSayur().add(vegetable);
      }
      public void SayurBusuk(int index){
            System.out.println(super.getSayur().poll());
      }
      public Queue<String> SayurSisa(){
            return super.getSayur();
      }
}