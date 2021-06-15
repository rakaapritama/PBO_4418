/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOAdmin;
import mvc.Model.Admin;
import mvc.Model.TabelModelAdmin;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IAdmin;
/**
 *
 * @author Raka Apritama
 */
public class ControllerAdmin {
    FormAdmin frameAdmin;
    IAdmin implUser;
    List<Admin> lb;
    
    public ControllerAdmin(FormAdmin frame){
        this.frameAdmin = frame;
        implUser = new DAOAdmin();
        lb = implUser.getAll();
    }
    
    
    public void reset(){
        frameAdmin.getTxtID().setText("");
        frameAdmin.getTxtNIK().setText("");
        frameAdmin.getTxtNama().setText("");
        frameAdmin.getTxtJk().setSelectedItem("");
        frameAdmin.getTxtAlamat().setText("");
        frameAdmin.getTxtUmur().setText("");
        frameAdmin.getTxtAlasan().setText("");
    }
    public void isiTable(){
        lb = implUser.getAll();
        TabelModelAdmin tmb = new TabelModelAdmin(lb);
        frameAdmin.getTabelData().setModel(tmb);
    }
    public void isiField(int row){
        frameAdmin.getTxtID().setText(lb.get(row).getId().toString());
        frameAdmin.getTxtNIK().setText(lb.get(row).getNIK());
        frameAdmin.getTxtNama().setText(lb.get(row).getNama());
        frameAdmin.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frameAdmin.getTxtAlamat().setText(lb.get(row).getAlamat());
        frameAdmin.getTxtUmur().setText(lb.get(row).getUsia().toString());
        frameAdmin.getTxtAlasan().setText(lb.get(row).getAlasan());
    }

    public void update(){
        if(!frameAdmin.getTxtNIK().getText().trim().isEmpty()& !frameAdmin.getTxtNama().getText().trim().isEmpty()){
            Admin u = new Admin();
            u.setId(Integer.parseInt(frameAdmin.getTxtID().getText()));
            u.setNIK(frameAdmin.getTxtNIK().getText());
            u.setNama(frameAdmin.getTxtNama().getText());
            u.setJk(frameAdmin.getTxtJk().getSelectedItem().toString());
            u.setAlamat(frameAdmin.getTxtAlamat().getText());
            u.setUsia(Integer.parseInt(frameAdmin.getTxtUmur().getText()));
            u.setAlasan(frameAdmin.getTxtAlasan().getText());
            implUser.update(u);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frameAdmin, "Pilih data yang akan di ubah");
        }
    }
    public void delete(){
        if(!frameAdmin.getTxtID().getText().trim().isEmpty()){
            String id = frameAdmin.getTxtID().getText();
            implUser.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        }else {
            JOptionPane.showMessageDialog(frameAdmin, "Pilih Data yang akan di hapus");
        }
    }
    public void isiTableCariNama(){
        lb = implUser.getCariNama(frameAdmin.getTxtCariNama().getText());
        TabelModelAdmin tmb = new TabelModelAdmin(lb);
        frameAdmin.getTabelData().setModel(tmb);
    }
    public void carinama(){
        implUser.getCariNama(frameAdmin.getTxtCariNama().getText());
        isiTableCariNama();
    }
}
