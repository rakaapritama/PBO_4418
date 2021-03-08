/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */
public class TestSimpleCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        //radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        //radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " +  circle3.getArea());
        
        //modify
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " +  circle2.radius  + " is " + circle2.getArea());
    }  
}
class SimpleCircle {
    float radius = 1;
    
    SimpleCircle() {
    }
    SimpleCircle(float newRadius) {
        radius = newRadius;
    }
    //Return area 
    double getArea() {
        return radius * radius * Math.PI;
    }
    //set new radius
    float setRadius(float newRadius) {
        return radius = newRadius;
    }

}



