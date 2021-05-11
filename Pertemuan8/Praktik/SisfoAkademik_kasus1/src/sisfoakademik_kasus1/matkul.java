/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfoakademik_kasus1;

import java.util.ArrayList;

/**
 *
 * @author Raka Apritama
 */
public class matkul extends univ {
    
    public void set_matkul(){
        super.set_matkulmhs();
    }
    
}

class matkulpokok extends matkul{
    
    ArrayList<String> matkulpokok=new ArrayList<String>();
    public void set_matakuliahpokok(String matakuliah_pokok){
        matkulpokok.add(matakuliah_pokok);

    }

    public void get_matkulpokok(){
        System.out.println("Matakuliah pokok:"+matkulpokok);
    }
}

class matkultambahan extends matkul{
    
    ArrayList<String> matkultambahan = new ArrayList<String>();
    public void set_matakuliahtambahan(String matakuliah_tambahan){
        matkultambahan.add(matakuliah_tambahan);

    }

    public void get_matkultambahan(){
        System.out.println("Matakuliah Tambahan:"+matkultambahan);
    }
}
