/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Antonio de Carvalho
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    private String valorConsulta;
    
    public Medico() {
        
    }
    
    public Medico(int id, String nome, String cpf, String rua, String numero, String bairro, String cidade, String estado, String cep, String telefone, String nascimento, String sexo, String crm, String especialidade, String valorConsulta) {
        super(id, nome, cpf, rua, numero, bairro, cidade, estado, cep, telefone, nascimento, sexo);
        this.crm = crm;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(String valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
