/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GmmVendas;
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
public class DaoGmmVendas {
    public void insert(Object object) {
        GmmVendas gmmVendas = (GmmVendas) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_guilherme_mereles";
            user = "guilherme_mereles";
            password = "guilherme_mereles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gmm_pedidos values (?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, gmmVendas.getGmmIdVendas());
            pst.setString(2, gmmVendas.getGmmUsuario());
            pst.setString(3, gmmVendas.getGmmValorTotal());
            pst.setString(4, gmmVendas.getGmmFormaPagamento());
            pst.setDate(5, null);
            pst.setString(6, gmmVendas.getGmmStatusVenda());
            pst.setString(7, gmmVendas.getGmmDesconto());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
