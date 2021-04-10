/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import transportasi.Bicycle;
import transportasi.Mobil;
/**
 *
 * @author Raka Apritama
 */
public class TransportasiDemo {
    public static void main(String[] args){
        Bicycle bike1 = new Bicycle();
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates(); 
        
        Mobil car1 = new Mobil("Hitam", 2001);
        car1.getwarna();
        car1.gettahun();
        
        System.out.println("Warna Mobil : "+car1.getwarna());
        System.out.println("Thun Mobil : "+car1.gettahun());
        
    }


}
