package Telas;

import Banco.ProdutoSQL;
import DAO.ProdutoDAO;
import DAO.Utilitario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class TelaProduto extends javax.swing.JFrame {

    private final Banco.Conexao conexao;
    private PreparedStatement st;
    private ResultSet rs;
    private String sql;

    public TelaProduto() {
        initComponents();

        conexao = new Banco.Conexao();
        carregadados();
        Carregacb();

        tf_codigo.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dados_pessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTabbedPane = new javax.swing.JTabbedPane();
        cadastro_produto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descmarca = new javax.swing.JLabel();
        tf_produto = new javax.swing.JTextField();
        tf_valor = new javax.swing.JTextField();
        tf_estoque = new javax.swing.JTextField();
        cb_marca = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        btn_pesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_produtos = new javax.swing.JTable();
        bt_limpar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produtos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dados_pessoais.setBackground(new java.awt.Color(200, 221, 242));
        dados_pessoais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de produtos:");

        javax.swing.GroupLayout dados_pessoaisLayout = new javax.swing.GroupLayout(dados_pessoais);
        dados_pessoais.setLayout(dados_pessoaisLayout);
        dados_pessoaisLayout.setHorizontalGroup(
            dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dados_pessoaisLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dados_pessoaisLayout.setVerticalGroup(
            dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dados_pessoaisLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        JTabbedPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTabbedPaneKeyPressed(evt);
            }
        });

        cadastro_produto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Estoque:");

        descmarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descmarca.setText("Marca");

        tf_produto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_valor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_estoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_estoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cb_marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Codigo: ");

        tf_codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_pesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_pesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\buscar.png")); // NOI18N
        btn_pesquisar.setText("Pesquisar");
        btn_pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastro_produtoLayout = new javax.swing.GroupLayout(cadastro_produto);
        cadastro_produto.setLayout(cadastro_produtoLayout);
        cadastro_produtoLayout.setHorizontalGroup(
            cadastro_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastro_produtoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(cadastro_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastro_produtoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(descmarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastro_produtoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastro_produtoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        cadastro_produtoLayout.setVerticalGroup(
            cadastro_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastro_produtoLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(cadastro_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pesquisar)
                    .addComponent(jLabel8)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(cadastro_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descmarca)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(cadastro_produtoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        JTabbedPane.addTab("Dados do produto", cadastro_produto);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Nome:");

        txtpesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyPressed(evt);
            }
        });

        btnpesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnpesquisar.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\buscar.png")); // NOI18N
        btnpesquisar.setText("Pesquisar || Atualizar");
        btnpesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        tabela_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela_produtos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTabbedPane.addTab("Consulta de produtos", jPanel3);

        bt_limpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_limpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\novo.png")); // NOI18N
        bt_limpar.setText("Limpar");
        bt_limpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limparActionPerformed(evt);
            }
        });

        bt_salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\salvar.png")); // NOI18N
        bt_salvar.setText("Cadastrar");
        bt_salvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_editar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\editar.png")); // NOI18N
        bt_editar.setText("Editar");
        bt_editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_excluir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_excluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\excluir.png")); // NOI18N
        bt_excluir.setText("Excluir");
        bt_excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_alterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bt_alterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\03595350111\\Documents\\NetBeansProjects\\VendaEXSenac\\src\\Imagens\\modificar.png")); // NOI18N
        bt_alterar.setText("Alterar");
        bt_alterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dados_pessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bt_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_excluir)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_alterar, bt_editar, bt_excluir, bt_limpar, bt_salvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar)
                    .addComponent(bt_alterar)
                    .addComponent(bt_editar)
                    .addComponent(bt_excluir)
                    .addComponent(bt_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_alterar, bt_editar, bt_excluir, bt_limpar, bt_salvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        // Editar para alterar

        if (tabela_produtos.getSelectedRow() > -1) {

            JTabbedPane.setSelectedIndex(0);
            
            bt_salvar.setEnabled(false);
            cb_marca.setVisible(false);
            descmarca.setVisible(false);
            bt_editar.setEnabled(false);

            tf_codigo.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 0).toString());
            tf_produto.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1).toString());
            tf_valor.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 3).toString());
            tf_estoque.setText(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 2).toString());

        } else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar um cliente em consulta de cliente!");
        }


    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        // Excluir
        if (tabela_produtos.getSelectedRow() > -1) {

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir?");

            if (escolha == 0) {

                Banco.ProdutoSQL msql = new Banco.ProdutoSQL();
                msql.produto.setId_prod(Integer.parseInt(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 0).toString()));
                if (msql.ExcluirProduto() > 0) {

                    JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir produto!");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado pelo usuário!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar um produto em consulta de produto para excluir!");
        }

        new Utilitario().LimpaTela(cadastro_produto);
        bt_salvar.setEnabled(true);
        cb_marca.setVisible(true);
        descmarca.setVisible(true);
        bt_editar.setEnabled(true);

    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        // Limpar dados
        new Utilitario().LimpaTela(cadastro_produto);
        bt_salvar.setEnabled(true);
        cb_marca.setVisible(true);
        descmarca.setVisible(true);
        bt_editar.setEnabled(true);

    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        // Cadastrar novo Cliente

        if (tf_produto.getText().trim().length() > 0 && tf_valor.getText().trim().length() > 0
                && tf_estoque.getText().trim().length() > 0) {

            Banco.ProdutoSQL prd = new Banco.ProdutoSQL();

            Item i = (Item) cb_marca.getSelectedItem();

            prd.produto.setDesc_prod(tf_produto.getText());
            prd.produto.setValor(Double.parseDouble(tf_valor.getText()));
            prd.produto.setEstoque(Integer.parseInt(tf_estoque.getText()));

            prd.produto.setFk_marca(Integer.parseInt(i.id.toString()));

            if (prd.InsereProduto() > 0) {
                JOptionPane.showMessageDialog(null, "Inserido");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é permitido campo em branco!!");
        }
        new Utilitario().LimpaTela(cadastro_produto);
        


    }//GEN-LAST:event_bt_salvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carrega a lista


    }//GEN-LAST:event_formWindowActivated

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // Pesquisar por nome o produto botão
        ProdutoSQL dao = new ProdutoSQL();
        String nome = "%" + txtpesquisa.getText() + "%";
        List<ProdutoDAO> lista = dao.buscaProdutoPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela_produtos.getModel();
        dados.setNumRows(0);
        lista.forEach((c) -> {
            dados.addRow(new Object[]{
                c.getId_prod(),
                c.getDesc_prod(),
                c.getEstoque(),
                c.getValor(),
                c.getFk_marca()
            });
        });
        txtpesquisa.setText("");
        
    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void JTabbedPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTabbedPaneKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_JTabbedPaneKeyPressed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        // Alterar cliente
        if (tabela_produtos.getSelectedRow() > -1) {
            if (tf_produto.getText().trim().length() > 0 && tf_codigo.getText().trim().length() > 0
                    && tf_valor.getText().trim().length() > 0 && tf_estoque.getText().trim().length() > 0) {

                int escolha = JOptionPane.showConfirmDialog(null, "Deseja alterar?");
                if (escolha == 0) {
                    Banco.ProdutoSQL altera = new Banco.ProdutoSQL();
                    altera.produto.setDesc_prod(tf_produto.getText());
                    altera.produto.setValor(Double.parseDouble(tf_valor.getText()));
                    altera.produto.setEstoque(Integer.parseInt(tf_estoque.getText()));

                    altera.produto.setId_prod(Integer.parseInt(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 0).toString()));
                    if (altera.AlterarProduto() > 0) {
                        JOptionPane.showMessageDialog(null, "Dados do cliente alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao alterar cliente!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cancelado pelo usuário!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "É preciso editar para alterar!!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar um cliente em consulta cliente para alterar!!");
        }
        new Utilitario().LimpaTela(cadastro_produto);
        tf_produto.setEnabled(true);
        tf_valor.setVisible(true);
        tf_estoque.setVisible(true);
        bt_editar.setEnabled(true);


    }//GEN-LAST:event_bt_alterarActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        // Pesquisar produto ao digitar

        ProdutoSQL dao = new ProdutoSQL();
        String nome = "%" + txtpesquisa.getText() + "%";
        List<ProdutoDAO> lista = dao.buscaProdutoPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela_produtos.getModel();
        dados.setNumRows(0);
        lista.forEach((c) -> {
            dados.addRow(new Object[]{
                c.getId_prod(),
                c.getDesc_prod(),
                c.getEstoque(),
                c.getValor(),
                c.getFk_marca()
            });
        });


    }//GEN-LAST:event_txtpesquisaKeyPressed

    private void btn_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesquisarActionPerformed
        //Pesquisar exatamente pela a descrição na primeira pagina

        String nome = tf_produto.getText();
        ProdutoDAO obj = new ProdutoDAO();
        ProdutoSQL dao = new ProdutoSQL();

        obj = dao.consultaPorNome(nome);
        if (obj.getDesc_prod() != null) {
            //Exibir os dados do obj nos campos de texto
            tf_produto.setText(obj.getDesc_prod());
            tf_codigo.setText(String.valueOf(obj.getId_prod()));
            tf_valor.setText(String.valueOf(obj.getValor()));
            tf_estoque.setText(String.valueOf(obj.getEstoque()));
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }


    }//GEN-LAST:event_btn_pesquisarActionPerformed

    /**
     */
    public class Item {

        public String id, descricao;

        public Item(String id, String descricao) {

            this.id = id;
            this.descricao = descricao;

        }

        @Override
        public String toString() {

            return descricao;
        }

    }

    public void Carregacb() {

        sql = "select id_marca, desc_marca from marca";

        try {
            conexao.getConnection();
            st = conexao.connection.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String descricao = rs.getString(2);
                cb_marca.addItem(new Item(id, descricao));
            }

        } catch (Exception e) {

        }

    }

    public void carregadados() {
        try {
            conexao.getConnection();
            sql = "Select id_prod ID, desc_marca PRODUTO , estoque QUANTIDADE, valor VALOR from produto";
            st = conexao.connection.prepareStatement(sql);
            rs = st.executeQuery();

            DefaultTableModel tableModel = new DefaultTableModel(new String[]{}, 0) {
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }

            };

            int qtdeColunas = rs.getMetaData().getColumnCount();

            for (int indice = 1; indice <= qtdeColunas; indice++) {
                tableModel.addColumn(rs.getMetaData().getColumnLabel(indice));
            }

            tabela_produtos = new JTable(tableModel);
            DefaultTableModel dtm = (DefaultTableModel) tabela_produtos.getModel();

            while (rs.next()) {
                try {
                    String[] dados = new String[qtdeColunas];
                    for (int i = 1; i <= qtdeColunas; i++) {
                        dados[i - 1] = rs.getString(i);
                    }
                    dtm.addRow(dados);
                    System.out.println();
                } catch (Exception erro) {

                }
                jScrollPane1.setViewportView(tabela_produtos);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Ninbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton btn_pesquisar;
    private javax.swing.JButton btnpesquisar;
    public javax.swing.JPanel cadastro_produto;
    private javax.swing.JComboBox cb_marca;
    private javax.swing.JPanel dados_pessoais;
    private javax.swing.JLabel descmarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_produtos;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_estoque;
    private javax.swing.JTextField tf_produto;
    private javax.swing.JTextField tf_valor;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables
}
