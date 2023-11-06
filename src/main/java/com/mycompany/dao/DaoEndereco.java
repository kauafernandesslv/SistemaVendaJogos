 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getConexao;
import static com.mycompany.ferramentas.BancoDeDadosMySql.getStatement;
import static com.mycompany.ferramentas.BancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author kaua.1880
 */
public class DaoEndereco extends BancoDeDadosMySql {
    
private String sql;
   
    public Boolean inserir(int id, int id_cidade, String nome_rua, String cep, String numero_residencia){
        try{
            sql = "INSERT INTO ENDERECO (ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA) VALUES (?, ?, ?, ?, ?)";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setInt(1, id);
            getStatement().setInt(2, id_cidade);
            getStatement().setString(3, nome_rua);
            getStatement().setString(4, cep);
            getStatement().setString(5, numero_residencia);
           
            getStatement().executeUpdate();
           
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
   
    public Boolean alterar(int id, int novoId_cidade, String novoNome_rua, int novoCep, int novoNumero_residencia){
        try{
            sql = "UPDATE ENDERECO SET ID_CIDADE = ?, NOME = ?, UF = ? WHERE ID = ?";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setInt(5, id);
            getStatement().setInt(1, novoId_cidade);
            getStatement().setString(2, novoNome_rua);
            getStatement().setInt(3, novoCep);
            getStatement().setInt(4, novoNumero_residencia);
           
            getStatement().executeUpdate();
           
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
   
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM ENDERECO WHERE ID = ?";
           
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
            sql = "SELECT ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA FROM ENDERECO";
           
            setStatement(getConexao().prepareStatement(sql));
           
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        return getResultado();
    }
   
    public ResultSet listarPorId(int id){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA FROM ENDERECO WHERE ID = ?";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setInt(1, id);
           
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        return getResultado();
    }
   
    public ResultSet listarPorNome(String nome){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA FROM ENDERECO WHERE NOME LIKE ?";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setString(1, nome + "%");
           
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        return getResultado();
    }
   
    public ResultSet listarPorCidade(int id_cidade){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA FROM ENDERECO WHERE ID_CIDADE = ?";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setInt(1, id_cidade);
           
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        return getResultado();
    }
   
    public ResultSet listarPorCep(String cep){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA FROM ENDERECO WHERE CEP LIKE ?";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setString(1, cep + "%");
           
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        return getResultado();
    }
   
        public ResultSet listarPorNumero(int nome_rua){
        try{
            sql = "SELECT ID, ID_CIDADE, NOME_RUA, CEP, NUMERO_RESIDENCIA FROM ENDERECO WHERE NUMERO_RESIDENCIA = ?";
           
            setStatement(getConexao().prepareStatement(sql));
           
            getStatement().setInt(1, nome_rua);
           
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        return getResultado();
    }
   
    public int buscarProximoId(){
        int id = -1;
       
        try{
            sql = "SELECT MAX(ID) + 1 FROM ENDERECO";
           
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

