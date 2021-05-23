/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbideal;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Raka Apritama
 */
public class BBideal implements ActionListener {

    private Frame mainFrame;
    private Label headerLabel, Nim, Nama, Berat, Tinggi, cm, kg, id, inpbt, ket;
    TextField tNIM,tNAMA,tBERAT,tTINGGI;  
    Button Hasil1, Hasil2;
    /**
     * @param args the command line arguments
     */
    
    void tamplate(){
        mainFrame = new Frame("Cek Ideal Berat Badan");
        mainFrame.setSize(500,400);
        mainFrame.setBackground(Color.PINK);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label("Cek Ideal Berat");
        headerLabel.setBounds(170,60,150,20);
        headerLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        Nim = new Label("NIM");
        Nim.setBounds(70,120,50,20);
        tNIM = new TextField();
        tNIM.setBounds(150,120,250,20);
        
        Nama = new Label("NAMA");
        Nama.setBounds(70,150,50,20);
        tNAMA = new TextField();
        tNAMA.setBounds(150,150,250,20);
        
        Berat = new Label("BERAT");
        Berat.setBounds(70,180,50,20);
        tBERAT = new TextField();
        tBERAT.setBounds(150,180,150,20);
        kg = new Label("KG");
        kg.setBounds(305,180,150,20);
        
        Tinggi = new Label("TINGGI");
        Tinggi.setBounds(70,210,50,20);
        tTINGGI = new TextField();
        tTINGGI.setBounds(150,210,150,20);
        cm = new Label("CM");
        cm.setBounds(305,210,150,20);
        
        ket = new Label("Berdasarkan: ");
        ket.setBounds(70,250,90, 30);
        
        Hasil1 = new Button("WHO (BMI)");
        Hasil1.setBounds(170, 250, 100, 30);
        Hasil1.addActionListener(this);
        
        Hasil2 = new Button("Asia-Pacific (BMI)");
        Hasil2.setBounds(280, 250, 120, 30);
        Hasil2.addActionListener(this);
        
        id = new Label("Isi Identitas");
        id.setBounds(70, 300, 300, 30);
        id.setFont(new Font("Verdana", Font.PLAIN, 14));
        inpbt = new Label("Isi Berat dan Tinggi");
        inpbt.setBounds(70, 320, 300, 30);
        inpbt.setFont(new Font("Verdana", Font.PLAIN, 14));
        
        
        mainFrame.add(headerLabel);
        mainFrame.add(Nim);
        mainFrame.add(tNIM);
        mainFrame.add(Nama);
        mainFrame.add(tNAMA);
        mainFrame.add(Berat);
        mainFrame.add(tBERAT);
        mainFrame.add(kg);
        mainFrame.add(Tinggi);
        mainFrame.add(tTINGGI);
        mainFrame.add(cm);
        mainFrame.add(ket);
        mainFrame.add(Hasil1);
        mainFrame.add(Hasil2);
        mainFrame.add(id);
        mainFrame.add(inpbt);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) { 
        id.setText(tNIM.getText()+", "+tNAMA.getText());
        String s1 = tBERAT.getText();  
        String s2 = tTINGGI.getText();  
        double a = Double.parseDouble(s1);  
        double b = Double.parseDouble(s2);  
        double c = 0,d = 0;
        d = (b*b/10000);
        c = a/d;
        if(e.getSource()== Hasil1) {  
            if(c>=18.5 & c<=24.9) {  
                String result = String.valueOf(String.format("%.2f",c));
                inpbt.setText("Hasil: "+result+" kamu termasuk Normal");
            }else{
                String result = String.valueOf(String.format("%.2f",c));
                inpbt.setText("Hasil: "+result+" kamu termasuk Tidak Ideal");
            }            

        }else if(e.getSource()== Hasil2) {  
           if(c>=18.5 & c<=22.9){  
                String result = String.valueOf(String.format("%.2f",c));
                inpbt.setText("Hasil: "+result+" kamu termasuk Normal");  
            }else{
                String result = String.valueOf(String.format("%.2f",c));
                inpbt.setText("Hasil: "+result+" kamu termasuk Tidak Ideal");
            }
        }    
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        BBideal demo = new BBideal();
        demo.tamplate();
    }
    
}
