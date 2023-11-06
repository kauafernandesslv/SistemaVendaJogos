/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author kaua.1880
 */
public class ModCliente {
        private int id;
    private int idPessoa;

    public ModCliente(int id, int idPessoa) {
        this.id = id;
        this.idPessoa = idPessoa;
    }

    public ModCliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    @Override
    public String toString() {
        return "ModCliente{" + "id=" + id + ", idPessoa=" + idPessoa + '}';
    }
}
