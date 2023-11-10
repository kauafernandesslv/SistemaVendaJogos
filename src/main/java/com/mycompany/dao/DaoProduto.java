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
    
    public Boolean inserir(int id, int idCategoria, int idMarca, String nome, String descricao, Double preco){
        try{
            sql = "INSERT INTO PRODUTO (ID, ID_CATEGORIA, ID_MARCA, NOME, DESCRICAO, PRECO) VALUES (?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idCategoria);
            getStatement().setInt(3, idMarca);
            getStatement().setString(4, nome);
            getStatement().setString(5, descricao);
            getStatement().setDouble(6, preco);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idCategoria, int idMarca, String nome, String descricao, Double preco){
        try{
            sql = "UPDATE PRODUTO SET ID_CATEGORIA = ?, ID_MARCA = ?, NOME = ?, DESCRICAO = ?, PRECO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setInt(1, idCategoria);
            getStatement().setInt(2, idMarca);
            getStatement().setString(3, nome);
            getStatement().setString(4, descricao);
            getStatement().setDouble(5, preco);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PRODUTO WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorId(int id){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.ID = ?                    " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCategoria(String categoria){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE C.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, categoria + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorMarca(String marca){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE M.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, marca + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDescricao(String descricao){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,       " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.DESCRICAO LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, descricao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMaiorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.PRECO > ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoMenorQue(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.PRECO < ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPrecoIgualA(Double preco){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CATEGORIA,            " +
                "   M.NOME AS MARCA,                " +
                "   P.NOME AS NOME,                 " +
                "   P.DESCRICAO AS DESCRICAO,        " +
                "   P.PRECO AS PRECO                " +
                " FROM                              " +
                "   PRODUTO P                       " +
                " JOIN CATEGORIA C ON               " +
                "   C.ID = P.ID_CATEGORIA           " +
                " JOIN MARCA M ON                   " +
                "   M.ID = P.ID_MARCA               " +
                " WHERE P.PRECO = ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setDouble(1, preco);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = 0;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PRODUTO";
            
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
 
    

