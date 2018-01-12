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
public class Exame extends Pessoa{
    private String descricao;
    
    public Exame() {
        
    }
    
    public Exame(int id, String nome, String cpf, String rua, String numero, String bairro, String cidade, String estado, String cep, String telefone, String nascimento, String sexo) {
        super(id, nome, cpf, rua, numero, bairro, cidade, estado, cep, telefone, nascimento, sexo);
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}