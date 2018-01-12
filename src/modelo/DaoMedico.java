package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoMedico {
    
    Medico m = new Medico();
    ArrayList<Medico> medico = new ArrayList<>();
    Conexao connection = new Conexao();
    
    public Boolean buscaMedico(String id) throws ClassNotFoundException{
        
        connection.Conexao();
        String cmd = "select * from medico where id = "+ id +"";
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

    public void adicionaMedico(Medico medico) throws ClassNotFoundException {
        connection.Conexao();

        String sqlMedico = "insert into medico"
                + "(nome, cpf, telefone, nascimento, sexo, crm, especialidade, idEndereco, valorconsulta)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?, ?)",
                
                sqlEndereco = "insert into endereco"
                + "(rua, numero, bairro, cidade, estado, cep)"
                + " values(?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtMedico = connection.con.prepareStatement(sqlMedico);
            
            stmtEndereco.setString(1, medico.getRua());
            stmtEndereco.setString(2, medico.getNumero());
            stmtEndereco.setString(3, medico.getBairro());
            stmtEndereco.setString(4, medico.getCidade());
            stmtEndereco.setString(5, medico.getEstado());
            stmtEndereco.setString(6, medico.getCep());
            
            stmtEndereco.execute();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, medico.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtMedico.setString(1, medico.getNome());
            stmtMedico.setString(2, medico.getCpf());
            stmtMedico.setString(3, medico.getTelefone());
            stmtMedico.setString(4, medico.getNascimento());
            stmtMedico.setString(5, medico.getSexo());
            stmtMedico.setString(6, medico.getCrm());
            stmtMedico.setString(7, medico.getEspecialidade());
            stmtMedico.setInt(9, idEndereco);
            stmtMedico.setString(8, medico.getValorConsulta());

            stmtMedico.execute();
            

            JOptionPane.showMessageDialog(null, "DADOS SALVOS COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }

        connection.Desconecta();
    }

    public void excluiMedico(String cs, String id) throws ClassNotFoundException {

        connection.Conexao();
        String sql = "delete from medico where id = '" + id + "'";

        try {

            PreparedStatement stmt = connection.con.prepareStatement(sql);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "EXCLUÍDO COM SUCESSO !");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();

    }

    public void alteraMedico(Medico medico, String id) throws ClassNotFoundException {

        connection.Conexao();

        String sqlMedico = "update medico set id = ?, nome = ?, cpf = ? telefone = ?, nascimento = ?, sexo = ?, crm = ?, especialidade = ?, valorconsulta = ? where id='" + id + "'";
                
        String sqlEndereco = "update endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? where id='" + id + "'";

        try {

            PreparedStatement stmtEndereco = connection.con.prepareStatement(sqlEndereco);
            
            PreparedStatement stmtMedico = connection.con.prepareStatement(sqlMedico);

            stmtEndereco.setString(1, medico.getRua());
            stmtEndereco.setString(2, medico.getNumero());
            stmtEndereco.setString(3, medico.getBairro());
            stmtEndereco.setString(4, medico.getCidade());
            stmtEndereco.setString(5, medico.getEstado());
            stmtEndereco.setString(6, medico.getCep());
            
            stmtEndereco.executeUpdate();
            
            String sqlx = "select id from endereco where rua = ?";
            PreparedStatement stmtX = connection.con.prepareStatement(sqlx);
            stmtX.setString(1, medico.getRua());
            ResultSet resultSet = stmtX.executeQuery();
            
            int idEndereco = 0;
            while(resultSet.next()){
                idEndereco = resultSet.getInt("id");
            }
            
            
            stmtMedico.setString(1, medico.getNome());
            stmtMedico.setString(2, medico.getCpf());
            stmtMedico.setString(3, medico.getTelefone());
            stmtMedico.setString(4, medico.getNascimento());
            stmtMedico.setString(5, medico.getSexo());
            stmtMedico.setString(6, medico.getCrm());
            stmtMedico.setString(7, medico.getEspecialidade());
            stmtMedico.setInt(9, idEndereco);
            stmtMedico.setString(8, medico.getValorConsulta());

            stmtMedico.executeUpdate();

            JOptionPane.showMessageDialog(null, "Dados alterados com Sucesso !!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        connection.Desconecta();
    }
}
