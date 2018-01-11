package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoReceitaMedica {
    
    ReceitaMedica rm = new ReceitaMedica();
    ArrayList<ReceitaMedica> receitaMedica = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaReceitaMedica(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from receitaMedica where id = "+ id +"";
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

    public void adicionaReceitaMedica(ReceitaMedica receitaMedica) throws ClassNotFoundException {
        connection.Conexao();

        String sqlReceitaMedica = "insert into receitaMedica"
                + "(nome, cpf, telefone, nascimento, sexo, coren, idEndereco)"
                + " values(?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtReceitaMedica = connection.con.prepareStatement(sqlReceitaMedica);
            
            stmtEndereco.setString(1, receitaMedica.getRua());
            stmtEndereco.setString(2, receitaMedica.getNumero());
            stmtEndereco.setString(3, receitaMedica.getBairro());
            stmtEndereco.setString(4, receitaMedica.getCidade());
            stmtEndereco.setString(5, receitaMedica.getEstado());
            stmtEndereco.setString(6, receitaMedica.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, receitaMedica.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtReceitaMedica.setString(1, receitaMedica.getNome());
            stmtReceitaMedica.setString(2, receitaMedica.getCpf());
            stmtReceitaMedica.setString(3, receitaMedica.getTelefone());
            stmtReceitaMedica.setString(4, receitaMedica.getNascimento());
            stmtReceitaMedica.setString(5, receitaMedica.getSexo());
            stmtReceitaMedica.setString(6, receitaMedica.getCoren());
            stmtReceitaMedica.setInt(7, idEndereco);

            stmtReceitaMedica.execute();
            

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiReceitaMedica(String cs, String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from receitaMedica where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraReceitaMedica(ReceitaMedica receitaMedica, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlReceitaMedica = "update receitaMedica set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, coren = ? where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtReceitaMedica = connection.con.prepareStatement(sqlReceitaMedica);

            stmtEndereco.setString(1, receitaMedica.getRua());
            stmtEndereco.setString(2, receitaMedica.getNumero());
            stmtEndereco.setString(3, receitaMedica.getBairro());
            stmtEndereco.setString(4, receitaMedica.getCidade());
            stmtEndereco.setString(5, receitaMedica.getEstado());
            stmtEndereco.setString(6, receitaMedica.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, receitaMedica.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtReceitaMedica.setString(1, receitaMedica.getNome());
            stmtReceitaMedica.setString(2, receitaMedica.getCpf());
            stmtReceitaMedica.setString(3, receitaMedica.getTelefone());
            stmtReceitaMedica.setString(4, receitaMedica.getNascimento());
            stmtReceitaMedica.setString(5, receitaMedica.getSexo());
            stmtReceitaMedica.setString(6, receitaMedica.getCoren());
            stmtReceitaMedica.setInt(7, idEndereco);

            stmtReceitaMedica.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}