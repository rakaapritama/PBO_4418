/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */
public class TestTVpraktik2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume is " + tv2.volumeLevel);
    }
}

//Make TV Class    
class TV {

    int channel; 
    // make channel variable
    int volumeLevel;
    //make volumeLevel variable
    boolean on = false;
    //make on variable
        
    public TV(){}
    //Tv condition On
    public void turnOn() {
        on = true;
    }
    //Tv condition Off
    public void turnOff() {
        on = false;
    }
    //indicator to set Channel
    public void setChannel(int newChannel){
        channel = newChannel;
    }
    //indicator to set Volume
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    //channel was up
    public void channelUp() {
        ++channel ;
    }
    //channel was down
    public void channelDown() {
        --channel;
    }
    //volume was up
    public void volumeUp() {
        ++volumeLevel;
    }
    //volume was down
    public void volumeDown() {
        --volumeLevel ;
    }
}
