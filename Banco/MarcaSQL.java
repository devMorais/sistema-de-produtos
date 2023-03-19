/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import DAO.ClienteDAO;
import DAO.MarcaDAO;
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
public class MarcaSQL {

    private String sql;
    private PreparedStatement st;               // atrubuto
    public Conexao bd;
    public DAO.MarcaDAO marca;

    public MarcaSQL() {                         // metodo construtor

        bd = new Conexao();
        marca = new DAO.MarcaDAO();

    }

    public int InsereMarca() {

        sql = "insert into marca values(null, ?)";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, marca.getDesc_marca());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int ExcluirMarca() {

        sql = "Delete from marca where id_marca = ? ";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setInt(1, marca.getId_marca());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int AlterarMarca() {

        sql = "Update marca set desc_marca = ? where id_marca = ? ";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, marca.getDesc_marca());
            st.setInt(2, marca.getId_marca());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public List<MarcaDAO> buscaMarcaPorNome(String nome) { // retorna uma lista

        try {
            // 1º passo Criar a lista
            List<MarcaDAO> lista = new ArrayList<>();

            // 2º passo criar o sql, organizar e executar
            String sql = "select * from marca where desc_marca like ?";
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);

            st.setString(1, nome);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                MarcaDAO obj = new MarcaDAO();
                obj.setId_marca(rs.getInt("id_marca"));
                obj.setDesc_marca(rs.getString("desc_marca"));

                lista.add(obj);
            }

            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

}
