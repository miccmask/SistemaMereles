/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class JDbcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_guilherme_mereles";
            user = "guilherme_mereles";
            password = "guilherme_mereles";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            Statement stm = cnt.createStatement();
            stm.executeUpdate("insert into gmm_usuarios(gmm_idusuarios, gmm_nome, gmm_apelido, gmm_cpf) values(606, 'guilherme', 'gmm', 'cpf')");
            PreparedStatement pst = cnt.prepareStatement("insert into gmm_usuarios(gmm_idusuarios, gmm_nome, gmm_apelido, gmm_cpf) values(?, ?, ?, ?)");
            //pst.setInt(1, 606);
            //pst.setString(2, "guilherme");
            //pst.setString(3, "gmm");
            //pst.setString(4, "231123123");
            //pst.executeUpdate();
            //PreparedStatement pst = cnt.prepareStatement("update mpv_usuarios set mpv_nome=?, mpv_apelido=? where mpv_idusuarios = ?");
            //pst.setString(1, "carambolas");
            //pst.setString(2, "mic");
            //pst.setInt(3, 606);
            //pst.executeUpdate();
            //PreparedStatement pst = cnt.prepareStatement("delete from mpv_usuarios where mpv_idusuarios = ?");
            pst.setInt(1, 606);
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JDbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Executou");
    }
}
