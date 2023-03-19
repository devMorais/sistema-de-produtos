/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import DAO.TipoDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 03595350111
 */
public class TipoSQL {

    private String sql;
    private PreparedStatement st;               // atrubuto
    public Conexao bd;
    public DAO.TipoDAO tipo;

    public TipoSQL() {                         // metodo construtor

        bd = new Conexao();
        tipo = new DAO.TipoDAO();

    }

    public int InsereTipo() {

        sql = "insert into tipo values(null, ?)";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, tipo.getDesc_tipo());

            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int ExcluirTipo() {

        sql = "Delete from tipo where id_tipo = ? ";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setInt(1, tipo.getId_tipo());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int AlterarTipo() {

        sql = "Update tipo set desc_tipo = ? where id_tipo = ? ";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, tipo.getDesc_tipo());
            st.setInt(2, tipo.getId_tipo());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public List<TipoDAO> buscaTipoPorNome(String nome) { // retorna uma lista

        try {
            // 1º passo Criar a lista
            List<TipoDAO> lista = new ArrayList<>();

            // 2º passo criar o sql, organizar e executar
            String sql = "select * from tipo where desc_tipo like ?";
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);

            st.setString(1, nome);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                TipoDAO obj = new TipoDAO();
                obj.setId_tipo(rs.getInt("id_tipo"));
                obj.setDesc_tipo(rs.getString("desc_tipo"));

                lista.add(obj);
            }

            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

}
