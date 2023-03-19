/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Telas.TelaPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 03595350111
 */
public class UsuarioSQL {

    private PreparedStatement ps;
    private ResultSet rs;
    public Banco.Conexao conexao;
    public DAO.UsuarioDAO usuario;
    private String sql, ret;

    public UsuarioSQL() {
        conexao = new Banco.Conexao();
        usuario = new DAO.UsuarioDAO();
    }

    public String VerificaUsuario() {

        sql = "select nome from usuario where usuario = ? and senha = md5(?) and status = '1' ";
        ret = "";

        try {
            conexao.getConnection();
            ps = conexao.connection.prepareStatement(sql);
            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getSenha());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getRow() > 0) {
                ret = rs.getString(1);
                 JOptionPane.showMessageDialog(null, "Seja Bem vindo!");
                TelaPrincipal tp = new TelaPrincipal();
                tp.usuariologado = rs.getString("nome");
                tp.setVisible(true);
            } else {
                ret = "";
            }
            return ret;
        } catch (Exception erro) {
            System.out.print(erro.toString());
            return ret;
        }
    }
}
