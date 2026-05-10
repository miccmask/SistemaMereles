/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GmmCompras;
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
public class DaoGmmCompras {
    public void insert(Object object) {
        GmmCompras gmmCompras = (GmmCompras) object;
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
            pst.setInt(1, gmmCompras.getGmmIdCompras());
            pst.setString(2, gmmCompras.getGmmUsuario());
            pst.setString(3, gmmCompras.getGmmFornecedor());
            pst.setString(4, gmmCompras.getGmmNumeroNotaFiscal());
            pst.setDate(5, null);
            pst.setString(6, gmmCompras.getGmmValorTotal());
            pst.setDate(7, null);
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
