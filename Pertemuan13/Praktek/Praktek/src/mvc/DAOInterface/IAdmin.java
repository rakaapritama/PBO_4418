/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Admin;
/**
 *
 * @author Raka Apritama
 */
public interface IAdmin {
    public void insert(Admin u);
    public void update(Admin u);
    public void delete(String identitas);
    public List<Admin> getAll();
    public List<Admin> getCariNama(String nama);
}
