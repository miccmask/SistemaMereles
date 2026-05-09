/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class JDbcSelect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_guilherme_mereles";
            user = "guilherme_mereles";
            password = "guilherme_mereles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement("select * from gmm_usuarios");
            ResultSet rs = pst.executeQuery();
            while (rs.next() == true) {
            System.out.println("nome: " +rs.getString("gmm_nome"));
            System.out.println("cpf: " +rs.getString("gmm_cpf")); 
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Executou");
    }
}
