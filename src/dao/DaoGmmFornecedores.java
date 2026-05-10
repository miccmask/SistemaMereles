/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.GmmFornecedores;
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
public class DaoGmmFornecedores {
    public void insert(Object object) {
        GmmFornecedores gmmFornecedores = (GmmFornecedores) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_guilherme_mereles";
            user = "guilherme_mereles";
            password = "guilherme_mereles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into gmm_fornecedores values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, gmmFornecedores.getGmmIdFornecedores());
            pst.setString(2, gmmFornecedores.getGmmNome());
            pst.setString(3, gmmFornecedores.getGmmPelucia());
            pst.setString(4, gmmFornecedores.getGmmCpf());
            pst.setDate(5, null);
            pst.setString(6, gmmFornecedores.getGmmEmail());
            pst.setString(7, gmmFornecedores.getGmmTelefone());
            pst.setString(8, gmmFornecedores.getGmmSiteWeb());
            pst.setInt(9, gmmFornecedores.getGmmPrazoEntregaMedio());
            pst.setString(10, gmmFornecedores.getGmmInscricaoEstadual());
            pst.setString(11, gmmFornecedores.getGmmCondicaoPagamento());
            pst.setString(12, gmmFornecedores.getGmmCategoriaProduto());
            pst.setString(13, gmmFornecedores.getGmmBancoContaPagamento());
            pst.setString(14, gmmFornecedores.getGmmEnderecoCompleto());
            pst.setDate(15, null);
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
