/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ton
 */
public class Filme {

    private int ano;
    private String nome;
    private String descricao;
    private String elenco;
    private String imagem;

    public Filme() {
    }

    public Filme(int ano, String nome, String descricao, String elenco, String imagem) {
        this.ano = ano;
        this.nome = nome;
        this.descricao = descricao;
        this.elenco = elenco;
        this.imagem = imagem;
    }
    
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    
}
