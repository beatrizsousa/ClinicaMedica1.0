/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class Conexao {

    public ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/clinica";
    Connection con = null;
    String usuario = "root";
    String senha = "";

    public void Conexao() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "aqui ao mysql\n" + ex);
        }
    }

    public void Desconecta() {
        try {
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executaSql(String sql) {
        try {
            Statement stm = con.createStatement();
            rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}