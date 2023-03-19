/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import DAO.ClienteDAO;
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
public class ClienteSQL {

    private String sql;
    private PreparedStatement st;               // atrubuto
    public Conexao bd;
    public DAO.ClienteDAO cliente;

    public ClienteSQL() {                         // métoodo construtor

        bd = new Conexao();
        cliente = new DAO.ClienteDAO();

    }

    public int InsereCliente() {

        sql = "insert into cliente values(null, ?, ?, ?, ?, ?)";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, cliente.getNome());
            st.setString(2, cliente.getSobrenome());
            st.setInt(3, cliente.getIdade());
            st.setString(4, cliente.getFone());
            st.setInt(5, cliente.getFk_tipo());

            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int ExcluirCliente() {

        sql = "Delete from cliente where id_cliente = ? ";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setInt(1, cliente.getId_cliente());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int AlterarCliente() {

        sql = "Update cliente set nome = ?, sobrenome = ?, idade = ?, fone = ? where id_cliente = ?";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, cliente.getNome());
            st.setString(2, cliente.getSobrenome());
            st.setInt(3, cliente.getIdade());
            st.setString(4, cliente.getFone());
            st.setInt(5, cliente.getId_cliente());
            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public int CarregaCB() {

        sql = "insert into cliente values(null, ?)";
        try {

            st.setString(1, cliente.getNome());

            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }

    public List<ClienteDAO> buscaClientePorNome(String nome) { // retorna uma lista

        try {
            // 1º passo Criar a lista
            List<ClienteDAO> lista = new ArrayList<>();

            // 2º passo criar o sql, organizar e executar
            String sql = "select * from cliente where nome like ?";
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);

            st.setString(1, nome);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                ClienteDAO obj = new ClienteDAO();
                obj.setId_cliente(rs.getInt("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setSobrenome(rs.getString("sobrenome"));
                obj.setIdade(rs.getInt("idade"));
                obj.setFone(rs.getString("fone"));

                lista.add(obj);
            }

            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

    public ClienteDAO consultaPorNome(String nome) { // Primeira tela busca exatamente o objeto

        try {
            // 1º passo criar o sql, organizar e executar
            String sql = "select * from cliente where nome=?";
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            st.setString(1, nome);

            ResultSet rs = st.executeQuery();
            ClienteDAO obj = new ClienteDAO();
            if (rs.next()) {

                obj.setId_cliente(rs.getInt("id_cliente"));
                obj.setNome(rs.getString("nome"));
                obj.setSobrenome(rs.getString("sobrenome"));
                obj.setIdade(rs.getInt("idade"));
                obj.setFone(rs.getString("fone"));
            }
            return obj;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            return null;
        }
    }
}
