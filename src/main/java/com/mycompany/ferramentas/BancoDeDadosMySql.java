/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ferramentas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kaua.1880
 */
public class BancoDeDadosMySql {
   
    private static final String URL = 
        "jdbc:mysql://localhost:3306/sistemavendajogos?useSSL="
      + "false&allowPublicKeyRetrieval=true";
     
    
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";
    
    private static Connection conexao = null;
    private static PreparedStatement statement = null;
    private static ResultSet resultado = null;

    public static Connection obterConexao() {
        conexao = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Obtém a conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao obter a conexão com o banco de dados: " + e.getMessage());
        }
        return conexao;
    }

    public static void fecharConexao(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
    
    public static boolean conectar(){
        setConexao(BancoDeDadosMySql.obterConexao());
        
        if (getConexao() != null){
            System.out.println("Conexão com o banco de dados estabelecida.");
            return true;
        }else{
            return false;
        }
    }
    
    public static Connection getConexao() {
        return conexao;
    }

    public static void setConexao(Connection conexao) {
        BancoDeDadosMySql.conexao = conexao;
    }

    public static PreparedStatement getStatement() {
        return statement;
    }

    public static void setStatement(PreparedStatement statement) {
        BancoDeDadosMySql.statement = statement;
    }

    public static ResultSet getResultado() {
        return resultado;
    }

    public static void setResultado(ResultSet resultado) {
        BancoDeDadosMySql.resultado = resultado;
    }
}
