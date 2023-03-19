/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alisson.silva
 */
public class Conexao {

    public Connection connection = null;

    private String DRIVER = "com.mysql.cj.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/vendaex?useTimezone=true&serverTimezone=UTC";
    private String LOGIN = "root";
    private String SENHA = "senac";

    /**
     * metodo que faz conexao com o banco de dados retorna true se houve
     * sucesso, ou false em caso negativo
     */
    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            System.out.println("Conectou.");
            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver nao encontrado " + erro.toString());
            return false;
        } catch (SQLException erro) {
            System.out.println("Falha ao conectar " + erro.toString());
            return false;
        }
    }

    public void close() {
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException erro) {
        }
    }

}
