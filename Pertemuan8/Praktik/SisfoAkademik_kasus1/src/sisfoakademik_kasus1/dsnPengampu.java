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
public class dsnPengampu extends univ {
   
    public void pengampu(){
        super.set_dsnpengampu();
    }
    
    public void get_matkuldiampu(){
        System.out.println("Daftar dosen dan matakuliah yang diampu:"+super.ampu);
    }
    
}
