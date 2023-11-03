/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ferramentas;

/**
 *
 * @author 10156
 */
public class DadosTemporarios {
    public static Object tempObject;
    public static Object tempObject2;
    public static Object tempObject3;
    
    //Informações da sessão do usuário
    public static int idUsuarioLogado;
    public static String usuarioLogado;
    
    //Informações sobre o produto escolhido para compra
    //Obs: isto poderia ser feito utilizando a própria DAO do produto em conjunto
    //com as DAOs de categoria e marca. Foi feito desta forma para agilizar o processo
    //de desenvolvimento.
    public static String categoriaProdutoVenda;
    public static String marcaProdutoVenda;
}