package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoPaciente {
    
    Paciente p = new Paciente();
    ArrayList<Paciente> Paciente = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaPaciente(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from paciente where id = "+ id +"";
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

    public void adicionaPaciente(Paciente paciente) throws ClassNotFoundException {
        connection.Conexao();

        String sqlPaciente = "insert into paciente"
                + "(nome, cpf, telefone, nascimento, sexo, sus, observacao, pai, mae, estadoCivil, profissao, idEndereco)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtPaciente = connection.con.prepareStatement(sqlPaciente);
            
            stmtEndereco.setString(1, paciente.getRua());
            stmtEndereco.setString(2, paciente.getNumero());
            stmtEndereco.setString(3, paciente.getBairro());
            stmtEndereco.setString(4, paciente.getCidade());
            stmtEndereco.setString(5, paciente.getEstado());
            stmtEndereco.setString(6, paciente.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, paciente.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtPaciente.setString(1, paciente.getNome());
            stmtPaciente.setString(2, paciente.getCpf());
            stmtPaciente.setString(3, paciente.getTelefone());
            stmtPaciente.setString(4, paciente.getNascimento());
            stmtPaciente.setString(5, paciente.getSexo());
            stmtPaciente.setString(6, paciente.getSus());
            stmtPaciente.setString(7, paciente.getObservacao());
            stmtPaciente.setString(8, paciente.getPai());
            stmtPaciente.setString(9, paciente.getMae());
            stmtPaciente.setString(9, paciente.getEstadoCivil());
            stmtPaciente.setString(9, paciente.getProfissao());
            stmtPaciente.setInt(10, idEndereco);

            stmtPaciente.execute();
            

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiPaciente(String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from paciente where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraPaciente(Paciente paciente, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlPaciente = "update paciente set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, sus = ?, observacao = ?, pai = ?, mae = ?, where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtPaciente = connection.con.prepareStatement(sqlPaciente);

            stmtEndereco.setString(1, paciente.getRua());
            stmtEndereco.setString(2, paciente.getNumero());
            stmtEndereco.setString(3, paciente.getBairro());
            stmtEndereco.setString(4, paciente.getCidade());
            stmtEndereco.setString(5, paciente.getEstado());
            stmtEndereco.setString(6, paciente.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, paciente.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtPaciente.setString(1, paciente.getNome());
            stmtPaciente.setString(2, paciente.getCpf());
            stmtPaciente.setString(3, paciente.getTelefone());
            stmtPaciente.setString(4, paciente.getNascimento());
            stmtPaciente.setString(5, paciente.getSexo());
            stmtPaciente.setString(6, paciente.getSus());
            stmtPaciente.setString(7, paciente.getObservacao());
            stmtPaciente.setString(8, paciente.getPai());
            stmtPaciente.setString(9, paciente.getMae());
            stmtPaciente.setString(9, paciente.getEstadoCivil());
            stmtPaciente.setString(9, paciente.getProfissao());
            stmtPaciente.setInt(10, idEndereco);

            stmtPaciente.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}

