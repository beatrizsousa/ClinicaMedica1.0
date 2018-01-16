package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoMedicamento {
    
    Medicamento medto = new Medicamento();
    ArrayList<Medicamento> medicamento = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaMedicamento(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from medicamento where id = "+ id +"";
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

    public void adicionaMedicamento(Medicamento medicamento) throws ClassNotFoundException {
        connection.Conexao();

        String sqlMedicamento = "insert into medicamento"
                + "(nome, )"
                + " values(?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtMedicamento = connection.con.prepareStatement(sqlMedicamento);
            
            stmtEndereco.setString(1, medicamento.getRua());
            stmtEndereco.setString(2, medicamento.getNumero());
            stmtEndereco.setString(3, medicamento.getBairro());
            stmtEndereco.setString(4, medicamento.getCidade());
            stmtEndereco.setString(5, medicamento.getEstado());
            stmtEndereco.setString(6, medicamento.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, medicamento.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtMedicamento.setString(1, medicamento.getNome());
            stmtMedicamento.setString(2, medicamento.getCpf());
            stmtMedicamento.setString(3, medicamento.getTelefone());
            stmtMedicamento.setString(4, medicamento.getNascimento());
            stmtMedicamento.setString(5, medicamento.getSexo());
            stmtMedicamento.setString(6, medicamento.getCoren());
            stmtMedicamento.setInt(7, idEndereco);

            stmtMedicamento.execute();
            

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiMedicamento(String cs, String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from medicamento where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraMedicamento(Medicamento medicamento, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlMedicamento = "update medicamento set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, coren = ? where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtMedicamento = connection.con.prepareStatement(sqlMedicamento);

            stmtEndereco.setString(1, medicamento.getRua());
            stmtEndereco.setString(2, medicamento.getNumero());
            stmtEndereco.setString(3, medicamento.getBairro());
            stmtEndereco.setString(4, medicamento.getCidade());
            stmtEndereco.setString(5, medicamento.getEstado());
            stmtEndereco.setString(6, medicamento.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, medicamento.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtMedicamento.setString(1, medicamento.getNome());
            stmtMedicamento.setString(2, medicamento.getCpf());
            stmtMedicamento.setString(3, medicamento.getTelefone());
            stmtMedicamento.setString(4, medicamento.getNascimento());
            stmtMedicamento.setString(5, medicamento.getSexo());
            stmtMedicamento.setString(6, medicamento.getCoren());
            stmtMedicamento.setInt(7, idEndereco);

            stmtMedicamento.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}