

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */
public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle Sepedamotor = new MotorVehicle(4, "H R4 KA");
        
        kendaraan.goStraight();
        kendaraan.turnLeft();
        kendaraan.turnRight();
        Sepedamotor.getSizeofEngine();
        Sepedamotor.getLicencePlate();
        sepeda.ringBell();
        
        System.out.println("Plat Nomor Sepeda Motor : "+Sepedamotor.getLicencePlate());
        System.out.println("Gigi : "+Sepedamotor.getSizeofEngine());
    }
}
