/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GmmProdutos;
import bean.GmmUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JDbcCrud;

/**
 *
 * @author USER
 */
public class DaoGmmProdutos {
    
    public void insert(Object object) {
        GmmProdutos gmmProdutos = (GmmProdutos) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_guilherme_mereles";
            user = "guilherme_mereles";
            password = "guilherme_mereles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gmm_pelucia values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, gmmProdutos.getGmmIdPelucia());
            pst.setString(2, gmmProdutos.getGmmNome());
            pst.setString(3, gmmProdutos.getGmmPreco());
            pst.setInt(4, gmmProdutos.getGmmProdutora());
            pst.setInt(5, gmmProdutos.getGmmEstoque());
            pst.setString(6, gmmProdutos.getGmmCategoria());
            pst.setString(7, gmmProdutos.getGmmMaterial());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
