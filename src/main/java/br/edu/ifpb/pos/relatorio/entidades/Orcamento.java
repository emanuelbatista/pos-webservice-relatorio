package br.edu.ifpb.pos.relatorio.entidades;

import java.util.List;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class Orcamento {

    private String descricao;
    private long idVeiculo;
    private String email;
    private List<Servico> servicos;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
    
}
