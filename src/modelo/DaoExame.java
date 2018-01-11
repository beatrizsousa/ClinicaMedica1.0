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

    public void adicionaExame(Exame exame) throws ClassNotFoundException {
        connection.Conexao();

        String sqlExame = "insert into exame"
                + "(nome, cpf, telefone, nascimento)"
                + " values(?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtExame = connection.con.prepareStatement(sqlExame);
            
            stmtEndereco.setString(1, exame.getRua());
            stmtEndereco.setString(2, exame.getNumero());
            stmtEndereco.setString(3, exame.getBairro());
            stmtEndereco.setString(4, exame.getCidade());
            stmtEndereco.setString(5, exame.getEstado());
            stmtEndereco.setString(6, exame.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, exame.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtExame.setString(1, exame.getNome());
            stmtExame.setString(2, exame.getCpf());
            stmtExame.setString(3, exame.getTelefone());
            stmtExame.setString(4, exame.getNascimento());
            stmtExame.setString(5, exame.getSexo());
            stmtExame.setString(6, exame.getCoren());
            stmtExame.setInt(7, idEndereco);

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

    public void alteraExame(Exame exame, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlExame = "update exame set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, coren = ? where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtExame = connection.con.prepareStatement(sqlExame);

            stmtEndereco.setString(1, exame.getRua());
            stmtEndereco.setString(2, exame.getNumero());
            stmtEndereco.setString(3, exame.getBairro());
            stmtEndereco.setString(4, exame.getCidade());
            stmtEndereco.setString(5, exame.getEstado());
            stmtEndereco.setString(6, exame.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, exame.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtExame.setString(1, exame.getNome());
            stmtExame.setString(2, exame.getCpf());
            stmtExame.setString(3, exame.getTelefone());
            stmtExame.setString(4, exame.getNascimento());
            stmtExame.setString(5, exame.getSexo());
            stmtExame.setString(6, exame.getCoren());
            stmtExame.setInt(7, idEndereco);

            stmtExame.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}