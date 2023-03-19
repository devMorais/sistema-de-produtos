package Telas;

import Banco.MarcaSQL;
import DAO.MarcaDAO;
import DAO.Utilitario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class TelaMarca extends javax.swing.JFrame {

    private final Banco.Conexao conexao;
    private PreparedStatement st;
    private ResultSet rs;
    private String sql;

    public TelaMarca() {
        initComponents();

        conexao = new Banco.Conexao();
        carregadados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dados_pessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_marca = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        btnpesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_marca = new javax.swing.JTable();
        bt_limpar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro da Marca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dados_pessoais.setBackground(new java.awt.Color(200, 221, 242));
        dados_pessoais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro marca produto:");

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Descrição:");

        tf_marca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tf_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        JTabbedPane.addTab("Dados do produto", jPanel2);

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

        tabela_marca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela_marca);

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
                        .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE))
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

        JTabbedPane.addTab("Consulta marca", jPanel3);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dados_pessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar)
                    .addComponent(bt_alterar)
                    .addComponent(bt_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_editar)
                    .addComponent(bt_excluir))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_alterar, bt_editar, bt_excluir, bt_limpar, bt_salvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        // Editar para alterar

        if (tabela_marca.getSelectedRow() > -1) {

            JTabbedPane.setSelectedIndex(0);

            bt_salvar.setEnabled(false);

            tf_marca.setText(tabela_marca.getValueAt(tabela_marca.getSelectedRow(), 1).toString());
            bt_editar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar uma marca em consulta de marcas!");

        }

        //new Utilitario().LimpaTela(jPanel2);

    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        // Excluir
        if (tabela_marca.getSelectedRow() > -1) {

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja excluir?");

            if (escolha == 0) {

                Banco.MarcaSQL msql = new Banco.MarcaSQL();
                msql.marca.setId_marca(Integer.parseInt(tabela_marca.getValueAt(tabela_marca.getSelectedRow(), 0).toString()));
                if (msql.ExcluirMarca() > 0) {

                    JOptionPane.showMessageDialog(null, "Marca excluído com sucesso!");

                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir marca!");

                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado pelo usuário!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar uma marca em consulta de marca para excluir");
        }
        new Utilitario().LimpaTela(jPanel2);
        bt_salvar.setEnabled(true);
        bt_editar.setEnabled(true);


    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limparActionPerformed
        // Limpar dados
        new Utilitario().LimpaTela(jPanel2);
        bt_salvar.setEnabled(true);
        bt_editar.setEnabled(true);

    }//GEN-LAST:event_bt_limparActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        // Cadastrar novo Cliente
        if (tf_marca.getText().trim().length() > 0) {
            Banco.MarcaSQL mr = new Banco.MarcaSQL();

            mr.marca.setDesc_marca(tf_marca.getText());

            if (mr.InsereMarca() > 0) {
                JOptionPane.showMessageDialog(null, "Inserido");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir");
            }
        }else{
         JOptionPane.showMessageDialog(null, "Não é possivel inserir vazio");
    }

            new Utilitario().LimpaTela(jPanel2);

    }//GEN-LAST:event_bt_salvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carrega a lista


    }//GEN-LAST:event_formWindowActivated

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        // Pesquisar marca

        MarcaSQL dao = new MarcaSQL();
        String nome = "%" + txtpesquisa.getText() + "%";
        List<MarcaDAO> lista = dao.buscaMarcaPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela_marca.getModel();
        dados.setNumRows(0);
        lista.forEach((c) -> {
            dados.addRow(new Object[]{
                c.getId_marca(),
                c.getDesc_marca()
            });
        });

        new Utilitario().LimpaTela(jPanel2);
        bt_salvar.setEnabled(true);
        bt_editar.setEnabled(true);


    }//GEN-LAST:event_btnpesquisarActionPerformed

    private void JTabbedPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTabbedPaneKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_JTabbedPaneKeyPressed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed
        // Alterar cliente

        //  if (jtable.getSelectedRow() > -1) {
        if (tf_marca.getText().trim().length() > 0 & tabela_marca.getSelectedRow() > -1) {

            int escolha = JOptionPane.showConfirmDialog(null, "Deseja alterar?");
            if (escolha == 0) {
                Banco.MarcaSQL altera = new Banco.MarcaSQL();
                altera.marca.setDesc_marca(tf_marca.getText());
                altera.marca.setId_marca(Integer.parseInt(tabela_marca.getValueAt(tabela_marca.getSelectedRow(), 0).toString()));

                if (altera.AlterarMarca() > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do produto alterado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar produto!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cancelado pelo usuário!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "É preciso selecionar uma marca em consulta de marca para excluir");
        }

        new Utilitario().LimpaTela(jPanel2);
        bt_salvar.setEnabled(true);
        bt_editar.setEnabled(true);


    }//GEN-LAST:event_bt_alterarActionPerformed

    private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyPressed
        // Pesquisar na caixa de texto ao digitar

        MarcaSQL dao = new MarcaSQL();
        String nome = "%" + txtpesquisa.getText() + "%";
        List<MarcaDAO> lista = dao.buscaMarcaPorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela_marca.getModel();
        dados.setNumRows(0);
        lista.forEach((c) -> {
            dados.addRow(new Object[]{
                c.getId_marca(),
                c.getDesc_marca()
            });
        });


    }//GEN-LAST:event_txtpesquisaKeyPressed

    public void carregadados() {
        try {
            conexao.getConnection();
            sql = "Select id_marca ID, desc_marca DESCRIÇÃO from marca";
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

            tabela_marca = new JTable(tableModel);
            DefaultTableModel dtm = (DefaultTableModel) tabela_marca.getModel();

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
                jScrollPane1.setViewportView(tabela_marca);
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
            java.util.logging.Logger.getLogger(TelaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaMarca().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTabbedPane JTabbedPane;
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_limpar;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JPanel dados_pessoais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_marca;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables
}
