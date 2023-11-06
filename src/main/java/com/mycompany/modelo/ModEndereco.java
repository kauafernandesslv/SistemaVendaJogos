/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author kaua.1880
 */
public class ModEndereco {
      private int id;
    private int idCidade;
    private String nomeRua;
    private String cep;
    private String numeroResidencia;

    public ModEndereco(int id, int idCidade, String nomeRua, String cep, String numeroResidencia) {
        this.id = id;
        this.idCidade = idCidade;
        this.nomeRua = nomeRua;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
    }

    public ModEndereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    @Override
    public String toString() {
        return "ModEndereco{" + "id=" + id + ", idCidade=" + idCidade + ", nomeRua=" + nomeRua + ", cep=" + cep + ", numeroResidencia=" + numeroResidencia + '}';
    }
}
