/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author kaua.1880
 */
public class ModCategoriaJogos {
    private int id;
    private String nome_categoria;
  

    public ModCategoriaJogos() {
    }

    public ModCategoriaJogos(int id, String nome) {
        this.id = id;
        this.nome_categoria = nome_categoria;
     
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    @Override
    public String toString() {
        return "CategoriaJogos{" + "id=" + id + ", nome_categoria=" + nome_categoria + '}';
    }
}