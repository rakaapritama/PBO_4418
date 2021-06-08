/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;


import mvc.DAO.DAOPengguna;
import mvc.DAOInterface.IPengguna;
import mvc.Model.pengguna;
import mvc.Model.TabelModelPengguna;
import mvc.View.FormPengguna;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Raka Apritama
 */
public class penggunaController {
    FormPengguna Iframe;
    IPengguna implPengguna;
    List<pengguna> lb;
    
    public penggunaController(FormPengguna Iframe){
        this.Iframe = Iframe;
       
        implPengguna = new DAOPengguna();
        lb = implPengguna.getAll();
    }

    public void insert() {
        pengguna b = new pengguna();
        b.setId(Integer.parseInt(Iframe.getTxtID().getText()));
        b.setNama(Iframe.getTxtNama().getText());
        b.setJk(Iframe.getTxtJk().getSelectedItem().toString());
        b.setTempat_tinggal(Iframe.getTxtTtl().getText());
        b.setUsia(Integer.parseInt(Iframe.getTxtUsia().getText()));
        b.setAlasan(Iframe.getTxtAlasaan().getText());
        boolean res = implPengguna.insert(b);
        if (res)
            JOptionPane.showMessageDialog(null, "Simpan data sukses");   
        else
            JOptionPane.showMessageDialog(null, "GAGAL INSERT DATA\nKarena ID yang diinputkan sudah dipakai");        
    }

    public void reset() {
        if(Iframe.getTxtID().isEnabled())
            Iframe.getTxtID().setEditable(true);
        Iframe.getTxtID().setText("");
        Iframe.getTxtNama().setText("");
        Iframe.getTxtJk().setSelectedItem("");
        Iframe.getTxtTtl().setText("");
        Iframe.getTxtUsia().setText("");
        Iframe.getTxtAlasaan().setText("");
    }
    
}
