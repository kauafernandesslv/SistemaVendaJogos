/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.ferramentas.BancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author kaua.1880
 */
public class DaoPessoa  extends BancoDeDadosMySql{
    private String sql;
    
 public Boolean inserir(int id, int idEndereco, int idEstadoCivil, String nome, String sobrenome, String genero, String telefone, String email, String usuario, String senha){
        try{
            sql = "INSERT INTO PESSOA (ID, ID_ENDERECO, ID_ESTADO_CIVIL, NOME, SOBRENOME, GENERO, TELEFONE, EMAIL, USUARIO, SENHA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setInt(2, idEndereco);
            getStatement().setInt(3, idEstadoCivil);
            getStatement().setString(4, nome);
            getStatement().setString(5, sobrenome);
            getStatement().setString(6, genero);
            getStatement().setString(7, telefone);
            getStatement().setString(8, email);
            getStatement().setString(9, usuario);
            getStatement().setString(10, senha);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, int idEndereco, int idEstadoCivil, String nome, String sobrenome, String genero, String telefone, String email){
        try{
            sql = "UPDATE PESSOA SET ID_ENDERECO = ?, ID_ESTADO_CIVIL = ?, NOME = ?, SOBRENOME = ?, GENERO = ?, TELEFONE = ?, EMAIL = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(8, id);
            getStatement().setInt(1, idEndereco);
            getStatement().setInt(2, idEstadoCivil);
            getStatement().setString(3, nome);
            getStatement().setString(4, sobrenome);
            getStatement().setString(5, genero);
            getStatement().setString(6, telefone);
            getStatement().setString(7, email);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PESSOA WHERE ID = ?";
            
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
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " ;
            
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
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL,        " + 
                "   P.ID_ENDERECO AS ID_ENDERECO,   " +
                "   E.ID AS ID_ENDERECO             " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.ID = ?                    " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorRua(String rua){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE E.NOME_RUA LIKE ?           " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, rua + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCep(String cep){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE E.CEP LIKE ?                " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cep + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorNumeroResidencia(String numResidencia){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE E.NUMERO_RESIDENCIA LIKE ?  " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, numResidencia + "%");
            
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
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.NOME LIKE ?               " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSobrenome(String sobrenome){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.SOBRENOME LIKE ?          " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sobrenome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorGenero(String genero){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.GENERO LIKE ?             " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, genero + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTelefone(String telefone){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.TELEFONE LIKE ?           " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, telefone + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEmail(String email){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.EMAIL LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, email + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEstadoCivil(String estCivil){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE EC.NOME LIKE ?              " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, estCivil + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorUsuario(String usuario, boolean buscaParcial){
        try{
            sql = 
                " SELECT                            " +
                "   P.ID AS ID,                     " +
                "   C.NOME AS CIDADE,               " +
                "   E.NOME_RUA AS RUA,              " +
                "   E.CEP AS CEP,                   " +
                "   E.NUMERO_RESIDENCIA AS NUM_RES, " +
                "   P.NOME AS NOME,                 " +
                "   P.SOBRENOME AS SOBRENOME,       " +
                "   P.GENERO AS GENERO,             " +
                "   P.TELEFONE AS TELEFONE,         " +
                "   P.EMAIL AS EMAIL,               " +
                "   EC.NOME AS ESTADO_CIVIL         " +
                " FROM                              " +
                "   PESSOA P                        " +
                " JOIN ENDERECO E ON                " +
                "   E.ID = P.ID_ENDERECO            " +
                " JOIN CIDADE C ON                  " +
                "   C.ID = E.ID_CIDADE              " +
                " JOIN ESTADO_CIVIL EC ON           " +
                "   EC.ID = P.ID_ESTADO_CIVIL       " +
                " WHERE P.USUARIO LIKE ?            " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            if(buscaParcial)
                getStatement().setString(1, usuario + "%");
            else
                getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet recuperaSenha(String usuario){
        try{
            sql = 
                " SELECT                            " +
                "   ID,                             " +
                "   SENHA                           " +
                " FROM                              " +
                "   PESSOA                          " +
                " WHERE USUARIO LIKE ?                 " ;
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, usuario);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT IFNULL(MAX(ID), 0) + 1 FROM PESSOA";
            
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
