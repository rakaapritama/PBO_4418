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
public class Motorcycle extends MotorVehicle {
    private int numGear = 0;
    
    public Motorcycle() {
        
    }
    public void setGearFoot(int numGear) {
        this.numGear = numGear;
    }
    public int getGearFoot() {
        return numGear;
    }
}
