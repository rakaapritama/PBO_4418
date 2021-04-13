/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Raka Apritama
 */
public class Car extends MotorVehicle {
    private boolean seatbelt = false;
    
    public Car() {
        
    }
    public void setSeatBelt(int seatbelt) {
        if(seatbelt == 1){
            this.seatbelt = true;
        }else if(seatbelt == 0){
            this.seatbelt = false; 
        }
    }
    public boolean getSeatBelt() {
        return seatbelt;
    }
}
