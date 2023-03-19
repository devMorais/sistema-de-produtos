/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author FernandoA
 */
public class VendaDAO {

    private int cliente_id_cliente;
    private int produto_id_prod;
    private int qtd;
    private double valor;

    public int getCliente_id_cliente() {
        return cliente_id_cliente;
    }

    public void setCliente_id_cliente(int cliente_id_cliente) {
        this.cliente_id_cliente = cliente_id_cliente;
    }

    public int getProduto_id_prod() {
        return produto_id_prod;
    }

    public void setProduto_id_prod(int produto_id_prod) {
        this.produto_id_prod = produto_id_prod;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
