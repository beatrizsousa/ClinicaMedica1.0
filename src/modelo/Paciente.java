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
public class Paciente extends Pessoa{
    private String sus;
    private String observacao;
    private String pai;
    private String mae;
    private String estadoCivil;
    private String profissao;
    
    public Paciente() {
        
    }
    
    public Paciente(int id, String nome, String cpf, String rua, String numero, String bairro, String cidade, String estado, String cep, String telefone, String nascimento, String sexo, String sus, String observacao, String pai, String mae, String estadoCivil, String profissao) {
        super(id, nome, cpf, rua, numero, bairro, cidade, estado, cep, telefone, nascimento, sexo);
        this.sus = sus;
        this.observacao = observacao;
        this.pai = pai;
        this.mae = mae;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}