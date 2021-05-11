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
public class listMhsAmpu extends univ {
    
    public void set_dsn(){
        super.set_dsnpengampu();
        super.set_jadwal();
        super.get_datadsn();
    }
    
    public void set_mhs(){
        super.set_matkulmhs();
    }
    
    public void get_mhsampu(){
        super.get_listampumhs();
    }
    
    public void get_list(){
        if(univ.binaan.isEmpty()||super.matkul_mhs.equals(super.matkul_ampudsn)) {
            for(int i=0; i < univ.ampu.size(); i++) { 
                System.out.println("Mahasiswa Yang  diampu dosen "+univ.ampu.get(i).get(0)+":"+univ.binaan);
                System.out.println("Jam perkuliahan Mahasiswa pada : "+univ.jadwal.get(i).get(0));
            }
        }
        else {
            for(int i=0; i < univ.jadwal.size(); i++){
                System.out.println("Mahasiswa Yang  diampu dosen "+univ.ampu.get(i).get(0)+":"+univ.binaan.get(i).get(0));
                System.out.println("Jam perkuliahan Mahasiswa pada : "+univ.jadwal.get(i).get(0));
            }
        }            
    }
}
