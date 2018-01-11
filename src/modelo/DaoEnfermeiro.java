package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoEnfermeiro {
    
    Enfermeiro en = new Enfermeiro();
    ArrayList<Enfermeiro> enfermeiro = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaEnfermeiro(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from enfermeiro where id = "+ id +"";
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

    public void adicionaEnfermeiro(Enfermeiro enfermeiro) throws ClassNotFoundException {
        connection.Conexao();

        String sqlEnfermeiro = "insert into enfermeiro"
                + "(nome, cpf, telefone, nascimento, sexo, coren, idEndereco)"
                + " values(?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtEnfermeiro = connection.con.prepareStatement(sqlEnfermeiro);
            
            stmtEndereco.setString(1, enfermeiro.getRua());
            stmtEndereco.setString(2, enfermeiro.getNumero());
            stmtEndereco.setString(3, enfermeiro.getBairro());
            stmtEndereco.setString(4, enfermeiro.getCidade());
            stmtEndereco.setString(5, enfermeiro.getEstado());
            stmtEndereco.setString(6, enfermeiro.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, enfermeiro.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtEnfermeiro.setString(1, enfermeiro.getNome());
            stmtEnfermeiro.setString(2, enfermeiro.getCpf());
            stmtEnfermeiro.setString(3, enfermeiro.getTelefone());
            stmtEnfermeiro.setString(4, enfermeiro.getNascimento());
            stmtEnfermeiro.setString(5, enfermeiro.getSexo());
            stmtEnfermeiro.setString(6, enfermeiro.getCoren());
            stmtEnfermeiro.setInt(7, idEndereco);

            stmtEnfermeiro.execute();
            

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiEnfermeiro(String cs, String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from enfermeiro where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraEnfermeiro(Enfermeiro enfermeiro, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlEnfermeiro = "update enfermeiro set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, coren = ? where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtEnfermeiro = connection.con.prepareStatement(sqlEnfermeiro);

            stmtEndereco.setString(1, enfermeiro.getRua());
            stmtEndereco.setString(2, enfermeiro.getNumero());
            stmtEndereco.setString(3, enfermeiro.getBairro());
            stmtEndereco.setString(4, enfermeiro.getCidade());
            stmtEndereco.setString(5, enfermeiro.getEstado());
            stmtEndereco.setString(6, enfermeiro.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, enfermeiro.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtEnfermeiro.setString(1, enfermeiro.getNome());
            stmtEnfermeiro.setString(2, enfermeiro.getCpf());
            stmtEnfermeiro.setString(3, enfermeiro.getTelefone());
            stmtEnfermeiro.setString(4, enfermeiro.getNascimento());
            stmtEnfermeiro.setString(5, enfermeiro.getSexo());
            stmtEnfermeiro.setString(6, enfermeiro.getCoren());
            stmtEnfermeiro.setInt(7, idEndereco);

            stmtEnfermeiro.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}
