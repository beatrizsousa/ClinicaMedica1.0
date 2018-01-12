package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoExame {
    
    Exame ex = new Exame();
    ArrayList<Exame> exame = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaExame(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from exame where id = "+ id +"";
        try {
            PreparedStatement stmt = connection.con.prepareStatement(cmd);
            ResultSet rs = null;

            rs = stmt.executeQuery();
            String tnc = null;
            while(rs.next()){
               return true;
            }            
            stmt.close();
            stmt.execute();
            
        } catch (SQLException ex) {
            return false;
        }
        return false;
    }

    public void adicionaExame(Exame exame, Paciente paciente, Medico medico) throws ClassNotFoundException {
        connection.Conexao();

        
        String sqlExame = "insert into exame"
                + "(id_p, id_m)"
                + " values(?, ?)";
        try {

            PreparedStatement stmtExame = connection.con.prepareStatement(sqlExame);
            stmtExame.setInt(1, paciente.getId());
            stmtExame.setInt(2, medico.getId());

            stmtExame.execute();

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiExame(String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from exame where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraExame(Exame exame, String id, Paciente paciente, Medico medico) throws ClassNotFoundException {

        connection.Conexao();

        String sqlExame = "update exame set id_p = ?, id_m = ? where id='" + id + "'";
                
        try {

            PreparedStatement stmtExame = connection.con.prepareStatement(sqlExame);
            
            stmtExame.setInt(1, paciente.getId());
            stmtExame.setInt(2, medico.getId());

            stmtExame.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }

    public void adicionaExame(Exame exame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}