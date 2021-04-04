/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author Raka Apritama
 */
public class stackInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
            Sayur sayuran = new Sayur();
            System.out.println(sayuran.sayurSisa());
 
            sayuran.tambahSayur("Kol");
            sayuran.tambahSayur("Terong");
            sayuran.tambahSayur("Bayam");
            System.out.println(sayuran.sayurSisa());
 
            sayuran.sayurGanti(2,"Semangka");
            System.out.println(sayuran.sayurSisa());
 
            sayuran.sayurBusuk();
            System.out.println(sayuran.sayurSisa());   
    }
}
class Perkebunan_Sayur {
      Stack<String> vegetable = new Stack<String>();
 
      public Perkebunan_Sayur(){
 
      }
      public void setSayur(Stack<String> vegetable) {
            this.vegetable = vegetable;
      }
      public Stack<String> getSayur(){
            return this.vegetable;
      }
} 
class Sayur extends Perkebunan_Sayur {
      public void tambahSayur(String vegetable){
            super.getSayur().push(vegetable);
      }
      public String sayurBusuk(){
            return super.getSayur().pop();
      }
      public void sayurGanti(int index,String vegetable){
            super.getSayur().set(index, vegetable);
      }
      public Stack<String> sayurSisa(){
            return super.getSayur();
      }
}
