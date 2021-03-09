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

  
//    @param args the command line arguments
    int channel; 
//    make channel variable
    int volumeLevel;
//    make volumeLevel variable
    boolean on;
//     make on variable
    
    public static void main(String args[]) {
        // TODO code application logic here
        TestTVpraktik2 tv1 = new TestTVpraktik2();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TestTVpraktik2 tv2 = new TestTVpraktik2();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume is " + tv2.volumeLevel);
    }

    //  object construction
    TestTVpraktik2() { 
    } 
    
//    Tv condition On
    void turnOn(boolean on) {
        on = true;
    }
//    Tv condition Off
    void turnOff(boolean on) {
        on = false;
    }
//    indicator to set Channel
    void setChannel(int newChannel){
        channel = newChannel;
    }
//    indicator to set Volume
    void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
//      channel was up
    void channelUp() {
        ++channel ;
    }
//    channel was down
    void channelDown() {
        --channel;
    }
//    volume was up
    void volumeUp() {
        ++volumeLevel;
    }
//    volume was down
    void volumeDown() {
        --volumeLevel ;
    }
}