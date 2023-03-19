/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author 03595350111
 */
public class TestaConexão {

    public static void main(String[] args) {
        Conexao bd = new Conexao();

        bd.getConnection();

    }
}
