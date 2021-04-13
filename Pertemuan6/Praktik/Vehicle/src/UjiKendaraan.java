import vehicle.*;
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

    public static void kendaraanMelaju(Vehicle Vehicle){
        Vehicle.goStraight();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle Sepedamotor = new MotorVehicle(4, "H R4 KA");
        Motorcycle motor = new Motorcycle();
        Car mobil = new Car();
        kendaraanMelaju(new Vehicle());
        kendaraanMelaju(new Bicycle());
        kendaraanMelaju(new MotorVehicle());
        
        kendaraan.goStraight();
        kendaraan.turnLeft();
        kendaraan.turnRight();
        Sepedamotor.getSizeofEngine();
        Sepedamotor.getLicencePlate();
        sepeda.ringBell();
        motor.setGearFoot(2);
        mobil.setSeatBelt(0);
//        mobil.setSeatBelt(1);
        
        System.out.println("Plat Nomor Sepeda Motor : "+Sepedamotor.getLicencePlate());
        System.out.println("Gigi : "+Sepedamotor.getSizeofEngine());
        System.out.println("Gear of motor3: " + motor.getGearFoot());
//        System.out.println("Use sealbelt: " + mobil.getSeatBelt());
        System.out.println("Use sealbelt: " + mobil.getSeatBelt());
    }
    
}
