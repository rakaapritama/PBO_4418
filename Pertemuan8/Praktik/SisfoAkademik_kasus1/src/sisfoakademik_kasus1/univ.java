/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisfoakademik_kasus1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Raka Apritama
 */
public class univ {
    String nama_mhs;
    String nim_mhs;
    String matkul_mhs;
    String inpmatkul_mhs;
    String setjadwal_mhs;
    int nilai_pokok;
    int nilai_tambah;
    int nilai_akhir;
    
    String nama_dsn;
    String nip_dsn;
    String matkul_ampudsn;
    
    ArrayList<String> dosen = new ArrayList<String>();
    public static ArrayList<ArrayList<String>> jadwal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mahasiswa = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> binaan = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> ampu = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> matkulmhs = new ArrayList<ArrayList<String>>();
    
    public void set_namamhs() {
        Scanner input_mhs = new Scanner(System.in);
        System.out.print("Input nama mahasiswa : ");
        nama_mhs = input_mhs.nextLine();
        this.nama_mhs = nama_mhs;
    }
    
    public void set_nimmhs() {
        Scanner input_mhs = new Scanner(System.in);
        System.out.print("Input NIM mahasiswa : ");
        nim_mhs = input_mhs.nextLine();
        this.nim_mhs = nim_mhs;
    }
    
    public void set_inputmatkul() {
        Scanner input_mhs=new Scanner(System.in);
        System.out.print("Input Matakuliah yang ingin anda ambil:");
        inpmatkul_mhs=input_mhs.nextLine();
        this.inpmatkul_mhs = inpmatkul_mhs;
    }
    
    public void  set_matkulmhs(){
        this.matkul_mhs=matkul_mhs;

    } 
    
    public int set_nilaipokok(){
        Scanner input_nilai=new Scanner(System.in);
        System.out.print("Input masukan nilai matakuliah pokok:");
        nilai_pokok=input_nilai.nextInt();
        return nilai_pokok;

    }
    
    public int set_nilaitambah(){
        Scanner input_nilaitambah=new Scanner(System.in);
        System.out.print("Input masukan nilai matakuliah tambah:");
        nilai_tambah=input_nilaitambah.nextInt();
        return nilai_tambah;
    } 
    
    public int get_nilaiakhir(){
        nilai_akhir=(((60/100)*nilai_pokok)+((40/100)*nilai_tambah));
        return nilai_akhir;
    }

    public void set_namadsn() {
        Scanner input_dsn = new Scanner(System.in);
        System.out.print("Input nama dosen : ");
        nama_dsn = input_dsn.nextLine();
        this.nama_dsn = nama_dsn;
    }

    public void set_nipdsn() {
        Scanner input_dsn = new Scanner(System.in);
        System.out.print("Input NIP dosen : ");
        nip_dsn = input_dsn.nextLine();
        this.nip_dsn = nip_dsn;
    }
    
    public void set_matkulampudsn(){
        Scanner input_data=new Scanner(System.in);
        System.out.print("Input masukan Matakuliah yang dosen ampu:");
        matkul_ampudsn=input_data.nextLine();
        this.matkul_ampudsn = matkul_ampudsn;
    } 

    public void get_datadsn(){
        System.out.println("Data Dosen:"+ampu);
    }
    
    public void set_dsnpengampu(){
        int p=ampu.size();
        
        set_namadsn();
        set_nipdsn();
        set_matkulampudsn();
        ampu.add(new ArrayList<>());
        ampu.get(p).add(0,nama_dsn);
        ampu.get(p).add(1,nip_dsn);
        ampu.get(p).add(2,matkul_ampudsn);
    }
    
    public void set_inpmatkulmhs(){
        int p=matkulmhs.size();
        
        set_namamhs();
        set_nimmhs();
        set_inputmatkul();
        matkulmhs.add(new ArrayList<String>());
        matkulmhs.get(p).add(0,nama_mhs);
        matkulmhs.get(p).add(1,nim_mhs);
        matkulmhs.get(p).add(2,inpmatkul_mhs);
    }

    public void get_listampumhs(){
        for(int i=0; i < matkulmhs.size(); i++){
            for(int j=0; j < ampu.size(); j++){
                if(ampu.get(j).get(2).equals(matkulmhs.get(i).get(2))){
                    int p=binaan.size();
                    binaan.add(new ArrayList<String>());
                    binaan.get(p).add(matkulmhs.get(i).get(0));
                } 
            }
        }
    }  
    
    public void set_jadwal(){
        Scanner input_jadwal=new Scanner(System.in);
        System.out.print("Silahkan input Jadwal mengajar dosen:");
        setjadwal_mhs=input_jadwal.nextLine();
        int p=jadwal.size();
            jadwal.add(new ArrayList<String>());
            jadwal.get(p).add(0,setjadwal_mhs);
    }
}
