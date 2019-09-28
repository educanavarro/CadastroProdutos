package telas;

public class TelaCadastro extends javax.swing.JFrame {
    private TelaPrincipal telaAnterior;
    
    private TelaCadastro() {
        initComponents();
    }
    
    public TelaCadastro (TelaPrincipal telaAnterior){
        // Chamar construtor padrão
        this();
        this.telaAnterior = telaAnterior;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        nomeDoProduto = new javax.swing.JLabel();
        especificacoesTecnicas = new javax.swing.JLabel();
        txtNomeDoProduto = new javax.swing.JTextField();
        precoDeVenda = new javax.swing.JLabel();
        txtPrecoDeVenda = new javax.swing.JTextField();
        precoDeCusto = new javax.swing.JLabel();
        txtPrecoDeCusto = new javax.swing.JTextField();
        habilitarVendas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEspecificacoes = new javax.swing.JTextArea();
        boxHabilitarDesabilitar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        nomeDoProduto.setText("Nome do Produto");

        especificacoesTecnicas.setText("Especificações técnicas:");

        txtNomeDoProduto.setToolTipText("Informe o nome do produto");

        precoDeVenda.setText("Preço de Venda:");

        txtPrecoDeVenda.setToolTipText("Informe o preço do produto");

        precoDeCusto.setText("Preço de Custo:");

        txtPrecoDeCusto.setToolTipText("Informe o preço de custo");
        txtPrecoDeCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoDeCustoActionPerformed(evt);
            }
        });

        habilitarVendas.setText("Habilitar vendas:");

        txtAreaEspecificacoes.setColumns(20);
        txtAreaEspecificacoes.setRows(5);
        txtAreaEspecificacoes.setToolTipText("Informe as especificações");
        jScrollPane1.setViewportView(txtAreaEspecificacoes);

        boxHabilitarDesabilitar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desabilitado", "Habilitado" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeDoProduto)
                            .addComponent(txtNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecoDeVenda)
                                    .addComponent(precoDeCusto)
                                    .addComponent(txtPrecoDeCusto)
                                    .addComponent(habilitarVendas)
                                    .addComponent(boxHabilitarDesabilitar, 0, 105, Short.MAX_VALUE))))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(especificacoesTecnicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precoDeVenda)
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvar)
                .addGap(37, 37, 37)
                .addComponent(botaoCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(nomeDoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(especificacoesTecnicas)
                    .addComponent(precoDeVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPrecoDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precoDeCusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoDeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(habilitarVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxHabilitarDesabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Operação para fechar a janela:
        System.out.println("Fechando janela de cadastro");
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void txtPrecoDeCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoDeCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoDeCustoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        // TODO add your handling code here:
        System.out.println("Salvo");
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        System.out.println("Cancelado");
        this.dispose();
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<String> boxHabilitarDesabilitar;
    private javax.swing.JLabel especificacoesTecnicas;
    private javax.swing.JLabel habilitarVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeDoProduto;
    private javax.swing.JLabel precoDeCusto;
    private javax.swing.JLabel precoDeVenda;
    private javax.swing.JTextArea txtAreaEspecificacoes;
    private javax.swing.JTextField txtNomeDoProduto;
    private javax.swing.JTextField txtPrecoDeCusto;
    private javax.swing.JTextField txtPrecoDeVenda;
    // End of variables declaration//GEN-END:variables
}
