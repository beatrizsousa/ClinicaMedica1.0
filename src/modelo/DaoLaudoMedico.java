package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoLaudoMedico {
    
    LaudoMedico lm = new LaudoMedico();
    ArrayList<LaudoMedico> laudoMedico = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaLaudoMedico(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from laudoMedico where id = "+ id +"";
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

    public void adicionaLaudoMedico(LaudoMedico laudoMedico) throws ClassNotFoundException {
        connection.Conexao();

        String sqlLaudoMedico = "insert into laudoMedico"
                + "(nome, cpf, telefone, nascimento, sexo, coren, idEndereco)"
                + " values(?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtLaudoMedico = connection.con.prepareStatement(sqlLaudoMedico);
            
            stmtEndereco.setString(1, laudoMedico.getRua());
            stmtEndereco.setString(2, laudoMedico.getNumero());
            stmtEndereco.setString(3, laudoMedico.getBairro());
            stmtEndereco.setString(4, laudoMedico.getCidade());
            stmtEndereco.setString(5, laudoMedico.getEstado());
            stmtEndereco.setString(6, laudoMedico.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, laudoMedico.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtLaudoMedico.setString(1, laudoMedico.getNome());
            stmtLaudoMedico.setString(2, laudoMedico.getCpf());
            stmtLaudoMedico.setString(3, laudoMedico.getTelefone());
            stmtLaudoMedico.setString(4, laudoMedico.getNascimento());
            stmtLaudoMedico.setString(5, laudoMedico.getSexo());
            stmtLaudoMedico.setString(6, laudoMedico.getCoren());
            stmtLaudoMedico.setInt(7, idEndereco);

            stmtLaudoMedico.execute();
            

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiLaudoMedico(String cs, String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from laudoMedico where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraLaudoMedico(LaudoMedico laudoMedico, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlLaudoMedico = "update LaudoMedico set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, coren = ? where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtLaudoMedico = connection.con.prepareStatement(sqlLaudoMedico);

            stmtEndereco.setString(1, laudoMedico.getRua());
            stmtEndereco.setString(2, laudoMedico.getNumero());
            stmtEndereco.setString(3, laudoMedico.getBairro());
            stmtEndereco.setString(4, laudoMedico.getCidade());
            stmtEndereco.setString(5, laudoMedico.getEstado());
            stmtEndereco.setString(6, laudoMedico.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, laudoMedico.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtLaudoMedico.setString(1, laudoMedico.getNome());
            stmtLaudoMedico.setString(2, laudoMedico.getCpf());
            stmtLaudoMedico.setString(3, laudoMedico.getTelefone());
            stmtLaudoMedico.setString(4, laudoMedico.getNascimento());
            stmtLaudoMedico.setString(5, laudoMedico.getSexo());
            stmtLaudoMedico.setString(6, laudoMedico.getCoren());
            stmtLaudoMedico.setInt(7, idEndereco);

            stmtLaudoMedico.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}