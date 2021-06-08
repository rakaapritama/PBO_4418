/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.pengguna;
import mvc.DAOInterface.IPengguna;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raka Apritama
 */
public class DAOPengguna implements IPengguna {
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (id, nama, jk, tempat_tinggal, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set nama=?, jk=?, tempat_tinggal=?, usia=?, alasan=? where id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran order by id asc;";
    final String carinama = "SELECT * FROM tbl_pendaftaran where nama like ?";    
    
    public DAOPengguna(){
        connection = Koneksi.connection();
    }    

    @Override
    public boolean insert(pengguna b) {
        boolean result = true;
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getId());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getTempat_tinggal());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.executeUpdate();
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()){
//                b.setId(rs.getInt(1));
//            }
        } catch (SQLException ex){
            System.out.println("Berhasil Input");
            result = false;
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Input");
                result = false;
            }
        }
        return result;        
    }

    @Override
    public void update(pengguna b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);            
            statement.setString(1, b.getNama());
            statement.setString(2, b.getJk());
            statement.setString(3, b.getTempat_tinggal());
            statement.setInt(4, b.getUsia());
            statement.setString(5, b.getAlasan());
            statement.setInt(6, b.getId());
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println("Berhasil Update");
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Update");
            }
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
 
        } catch (SQLException ex){
            System.out.println("Berhasil Delete");
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<pengguna> getAll() {
        List<pengguna> lb = null;
        try{
            lb = new ArrayList<>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                pengguna b = new pengguna();
                b.setId(rs.getInt("id"));               
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setTempat_tinggal(rs.getString("tempat_tinggal"));
                b.setUsia(rs.getInt("usia"));               
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
                
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOPengguna.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;        
    }

    @Override
    public List<pengguna> getCariNama(String nama) {
        List<pengguna> lb = null;
        try{
            lb = new ArrayList<pengguna>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama +"%");
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                pengguna b = new pengguna();
                b.setId(rs.getInt("id"));               
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setTempat_tinggal(rs.getString("tempat_tinggal"));
                b.setUsia(rs.getInt("usia"));               
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
                
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOPengguna.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lb;
    }
    
}
