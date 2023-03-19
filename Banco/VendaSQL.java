/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author FernandoA
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class VendaSQL {

    private String sql;
    private PreparedStatement st;               // atributo
    private ResultSet rs;
    public Conexao bd;
    public DAO.VendaDAO venda;

    public VendaSQL() {                         // método construtor

        bd = new Conexao();
        venda = new DAO.VendaDAO();

    }

    public int InsereVendas() {

        sql = "insert into vendas values(null, ?, ?, curdate(), ?, ?)";
        try {
            bd.getConnection();
            st = bd.connection.prepareStatement(sql);

            st.setInt(1, venda.getCliente_id_cliente());
            st.setInt(2, venda.getProduto_id_prod());
            st.setInt(3, venda.getQtd());
            st.setDouble(4, venda.getValor());

            return st.executeUpdate();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }

    }
      public double retornaVendaPorData() {
         sql = "select ifnull(sum(valor*qtd),0) as total from vendas where data_venda = curdate()";
         
         try {
            double totalvenda = 0;

            bd.getConnection();
            st = bd.connection.prepareStatement(sql);
            //st.setString(1, data_venda.toString());

            rs = st.executeQuery();
            if (rs.next()) {
                totalvenda = rs.getDouble("total");
            }
            return totalvenda;

        }catch(Exception e) {
            System.out.print("aquui"+e);
            return 0;
        }

    }
      
      public void teste(){
      
      System.out.print("chamei o teste");
      }
    
    
}
