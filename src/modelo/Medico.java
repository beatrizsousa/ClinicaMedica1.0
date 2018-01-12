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
    private String valorconsulta;
    
    public Medico() {
        
    }
    
    public Medico(String id, String nome, String cpf, String rua, String numero, String bairro, String cidade, String estado, String cep, String telefone, String nascimento, String sexo, String crm, String especialidade, String valorconsulta) {
        super(id, nome, cpf, rua, numero, bairro, cidade, estado, cep, telefone, nascimento, sexo);
        this.crm = crm;
        this.especialidade = especialidade;
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
    public String getValorconsulta() {
        return valorconsulta;
    }

    public void setValorconsulta(String valorconsulta) {
        this.valorconsulta = valorconsulta;
    }
}
