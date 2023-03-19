/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import DAO.ProdutoDAO;
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
public class ProdutoSQL {

    private String sql;
    private PreparedStatement st;               // atrubuto
    public Conexao bd;
    public DAO.ProdutoDAO produto;

    public ProdutoSQL() {                         // metodo construtor

        bd = new Conexao();
        produto = new DAO.ProdutoDAO();

    }

    public int InsereProduto() {

        sql = "insert into produto values(null, ?, ?, ?, ?)";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, produto.getDesc_prod());
            st.setDouble(2, produto.getValor());
            st.setInt(3, produto.getEstoque());
            st.setDouble(4, produto.getFk_marca());

            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int ExcluirProduto() {

        sql = "Delete from produto where id_prod = ? ";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setInt(1, produto.getId_prod());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int AlterarProduto() {

        sql = "Update produto set desc_marca = ?, valor = ?, estoque = ? where id_prod = ?";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, produto.getDesc_prod());
            st.setDouble(2, produto.getValor());
            st.setInt(3, produto.getEstoque());
            st.setInt(4, produto.getId_prod());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public List<ProdutoDAO> buscaProdutoPorNome(String nome) { // retorna uma lista

        try {
            // 1º passo Criar a lista
            List<ProdutoDAO> lista = new ArrayList<>();

            // 2º passo criar o sql, organizar e executar
            String sql = "select * from produto where desc_marca like ?";
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);

            st.setString(1, nome);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                ProdutoDAO obj = new ProdutoDAO();
                obj.setId_prod(rs.getInt("id_prod"));
                obj.setDesc_prod(rs.getString("desc_marca"));
                obj.setValor(rs.getInt("valor"));
                obj.setEstoque(rs.getInt("estoque"));
                obj.setFk_marca(rs.getInt("fk_marca"));

                lista.add(obj);
            }

            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

    public ProdutoDAO consultaPorNome(String nome) { // Primeira tela busca exatamente o objeto

        try {
            // 1º passo criar o sql, organizar e executar
            String sql = "select * from produto where desc_marca=?";
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, nome);

            ResultSet rs = st.executeQuery();
            ProdutoDAO obj = new ProdutoDAO();
            if (rs.next()) {

                obj.setId_prod(rs.getInt("id_prod"));
                obj.setDesc_prod(rs.getString("desc_marca"));
                obj.setValor(rs.getDouble("valor"));
                obj.setEstoque(rs.getInt("estoque"));
            }
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }

}
