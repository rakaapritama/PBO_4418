/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raka Apritama
 */

class Manusia {
   private String nama;
   private boolean punyaTV;
   
    Manusia (){
    }
    public Manusia(String nama) {
       this.nama  = nama;
    }
    public String namaSaya () {
       return nama;
    }
    public void beliTV(TV tvku) {
       punyaTV = true;
       System.out.println(punyaTV);
    }
    public void jualSemuaTV() {
       punyaTV = false;
       System.out.println(punyaTV);
    }
    boolean cekTV() {
        return punyaTV;
    }   
}
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

public class TestTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        man1.jualSemuaTV();
        
    }
}
