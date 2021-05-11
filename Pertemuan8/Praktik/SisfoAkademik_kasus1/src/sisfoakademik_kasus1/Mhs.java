/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfoakademik_kasus1;

/**
 *
 * @author Raka Apritama
 */
public class Mhs extends univ {
    
    public void set_inputmatkulmhs(){
        super.set_inpmatkulmhs();
    }

    public void getdata_mhs(){
        System.out.println("Data Mahasiswa:"+super.matkulmhs);
    }

    public void get_jadwal(){
        if(super.matkulmhs.equals(super.matkul_ampudsn)){
            System.out.println("anda memiliki jadwal pada"+super.jadwal);
        }
    }
}
