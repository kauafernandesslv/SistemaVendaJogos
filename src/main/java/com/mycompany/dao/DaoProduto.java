/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setResultado;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;


/**
 *
 * @author kaua.1880
 */
public class DaoProduto extends BancoDeDadosMySql{
     private String sql;

     public Boolean inserir(int idJogo, String titulo, String descricao, Double preco, String classificacao, String desenvolvedor, String dataLancamento){
    try {
        sql = "INSERT INTO JOGOS (IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setInt(1, idJogo);
        getStatement().setString(2, titulo);
        getStatement().setString(3, descricao);
        getStatement().setDouble(4, preco);
        getStatement().setString(5, classificacao);
        getStatement().setString(6, desenvolvedor);
        getStatement().setString(7, dataLancamento);
        
        getStatement().executeUpdate();
        
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }}
     
public Boolean alterar(int idJogo, String titulo, String descricao, Double preco, String classificacao, String desenvolvedor, String dataLancamento){
    try {
        sql = "UPDATE JOGOS SET TITULO = ?, DESCRICAO = ?, PRECO = ?, CLASSIFICACAO = ?, DESENVOLVEDOR = ?, DATA_LANCAMENTO = ? WHERE IDJOGO = ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setString(1, titulo);
        getStatement().setString(2, descricao);
        getStatement().setDouble(3, preco);
        getStatement().setString(4, classificacao);
        getStatement().setString(5, desenvolvedor);
        getStatement().setString(6, dataLancamento);
        getStatement().setInt(7, idJogo);
        
        getStatement().executeUpdate();
        
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }
}

public Boolean excluir(int idJogo){
    try {
        sql = "DELETE FROM JOGOS WHERE IDJOGO = ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setInt(1, idJogo);
        
        getStatement().executeUpdate();
        
        return true;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }
}

public ResultSet listarTodosJogos(){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS";
        
        setStatement(getConexao().prepareStatement(sql));
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogoPorId(int idJogo){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE IDJOGO = ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setInt(1, idJogo);
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogosPorTitulo(String titulo){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE TITULO LIKE ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setString(1, titulo + "%");
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogosPorDesenvolvedor(String desenvolvedor){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE DESENVOLVEDOR LIKE ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setString(1, desenvolvedor + "%");
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
       System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogosPorClassificacao(String classificacao){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE CLASSIFICACAO LIKE ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setString(1, classificacao + "%");
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogosPorPrecoMaiorQue(Double preco){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE PRECO > ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setDouble(1, preco);
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogosPorPrecoMenorQue(Double preco){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE PRECO < ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setDouble(1, preco);
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}

public ResultSet listarJogosPorPrecoIgualA(Double preco){
    try {
        sql = 
            "SELECT IDJOGO, TITULO, DESCRICAO, PRECO, CLASSIFICACAO, DESENVOLVEDOR, DATA_LANCAMENTO FROM JOGOS WHERE PRECO = ?";
        
        setStatement(getConexao().prepareStatement(sql));
        
        getStatement().setDouble(1, preco);
        
        setResultado(getStatement().executeQuery());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return getResultado();
}
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM JOGOS";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next(); //Move para o primeiro registro.
            
            id = getResultado().getInt(1); //Pega o valor retornado na consulta
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
    }
