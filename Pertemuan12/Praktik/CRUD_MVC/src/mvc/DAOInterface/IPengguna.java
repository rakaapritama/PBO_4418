/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;

import mvc.Model.pengguna;
import java.util.List;

/**
 *
 * @author Raka Apritama
 */
public interface IPengguna {
    public boolean insert (pengguna b);
    public void update (pengguna b);
    public void delete(int id);
    public List<pengguna> getAll();
    public List<pengguna> getCariNama(String nama);    
}
