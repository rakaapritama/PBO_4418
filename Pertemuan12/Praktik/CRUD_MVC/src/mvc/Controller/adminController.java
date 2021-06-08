/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOPengguna;
import mvc.DAOInterface.IPengguna;
import mvc.Model.pengguna;
import  mvc.Model.TabelModelPengguna;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Raka Apritama
 */
public class adminController {
    FormAdmin Aframe;
    IPengguna implPengguna;
    List<pengguna> lb;
    
    public adminController(FormAdmin Aframe){
        this.Aframe = Aframe;
       
        implPengguna = new DAOPengguna();
        lb = implPengguna.getAll();
    }    
    public void reset(){
        if(Aframe.getTxtID().isEnabled())
            Aframe.getTxtID().setEditable(true);
        Aframe.getTxtID().setText("");
        Aframe.getTxtNama().setText("");
        Aframe.getTxtJk().setSelectedItem("");
        Aframe.getTxtTtl().setText("");
        Aframe.getTxtUsia().setText("");
        Aframe.getTxtAlasan().setText("");
    }
    public void isiTable(){
        lb = implPengguna.getAll();
        TabelModelPengguna tmb = new TabelModelPengguna(lb);
        Aframe.getTabelData().setModel(tmb);
    }
    public void isiField(int row){
        Aframe.getTxtID().setEditable(false);
        String s=String.valueOf(lb.get(row).getId());
        Aframe.getTxtID().setText(s);
        Aframe.getTxtNama().setText(lb.get(row).getNama());
        Aframe.getTxtJk().setSelectedItem(lb.get(row).getJk());
        Aframe.getTxtTtl().setText(lb.get(row).getTempat_tinggal());     
        String i=String.valueOf(lb.get(row).getId());
        Aframe.getTxtUsia().setText(i);
        Aframe.getTxtAlasan().setText(lb.get(row).getAlasan());
    }
    public void update(){
            pengguna b = new pengguna();                       
            b.setNama(Aframe.getTxtNama().getText());
            b.setJk(Aframe.getTxtJk().getSelectedItem().toString());
            b.setTempat_tinggal(Aframe.getTxtTtl().getText());
            b.setUsia(Integer.parseInt(Aframe.getTxtUsia().getText()));
            b.setAlasan(Aframe.getTxtAlasan().getText());
            b.setId(Integer.parseInt(Aframe.getTxtID().getText()));       
            implPengguna.update(b);
            JOptionPane.showMessageDialog(null, "Update data sukses");                    
    }
    
    public void delete(){
        if(!Aframe.getTxtID().getText().trim().isEmpty()){
            int id = Integer.parseInt(Aframe.getTxtID().getText());
            implPengguna.delete(id);
            JOptionPane.showMessageDialog(null, "Delete data sukses");
        }else{
            JOptionPane.showMessageDialog(Aframe,"Pilih data yang akan di hapus");
        }
    }
    
    public void isiTableCariNama(){
        lb = implPengguna.getCariNama(Aframe.getTxtCariNama().getText());
        TabelModelPengguna tmb = new TabelModelPengguna(lb);
        Aframe.getTabelData().setModel(tmb);
    }
}
