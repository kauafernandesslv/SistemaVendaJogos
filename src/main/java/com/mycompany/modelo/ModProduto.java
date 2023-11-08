/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author kaua.1880
 */
public class ModProduto {
    private int idJogo;
    private String titulo;
    private String descricao;
    private double preco;
    private String classificacao;
    private String desenvolvedor;
    private String dataLancamento;

    public ModProduto(int idJogo, String titulo, String descricao, double preco, String classificacao, String desenvolvedor, String dataLancamento) {
        this.idJogo = idJogo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.classificacao = classificacao;
        this.desenvolvedor = desenvolvedor;
        this.dataLancamento = dataLancamento;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "ModProduto{" +
                "idJogo=" + idJogo +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", classificacao='" + classificacao + '\'' +
                ", desenvolvedor='" + desenvolvedor + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                '}';
    }
}
