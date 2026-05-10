/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GmmClientes;
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
public class DaoGmmClientes {
    public void insert(Object object) {
        GmmClientes gmmClientes = (GmmClientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_guilherme_mereles";
            user = "guilherme_mereles";
            password = "guilherme_mereles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gmm_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, gmmClientes.getGmmIdClientes());
            pst.setString(2, gmmClientes.getGmmNome());
            pst.setString(3, gmmClientes.getGmmTipoPessoa());
            pst.setString(4, gmmClientes.getGmmCpf());
            pst.setDate(5, null);
            pst.setString(6, gmmClientes.getGmmEmail());
            pst.setString(7, gmmClientes.getGmmTelefone());
            pst.setString(8, gmmClientes.getGmmLogradouro());
            pst.setInt(9, gmmClientes.getGmmNumero());
            pst.setString(10, gmmClientes.getGmmBairro());
            pst.setString(11, gmmClientes.getGmmCidade());
            pst.setString(12, gmmClientes.getGmmEstado());
            pst.setString(13, gmmClientes.getGmmCep());
            pst.setString(14, gmmClientes.getGmmLimiteCredito());
            pst.setString(15, gmmClientes.getGmmAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
