package telas;

import controles.ControleCadastro;
import entidades.Produto;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    private TelaPrincipal telaAnterior;
    private TelaRelatorio telaRelatorio;
    private Produto produto;
    
    private TelaCadastro() {
        initComponents();
    }
    
    public TelaCadastro (TelaPrincipal telaAnterior){
        // Chamar construtor padrão
        this();
        this.telaAnterior = telaAnterior;
    }

    public TelaCadastro(TelaRelatorio telaRelatorio, Produto produto) {
        this();
        this.telaRelatorio = telaRelatorio;
        this.produto = produto;
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
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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
        boxHabilitarDesabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHabilitarDesabilitarActionPerformed(evt);
            }
        });

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
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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
        String nome = nomeDoProduto.getText();
        String especificacoes = txtAreaEspecificacoes.getText();
        
        String precoVenda = txtPrecoDeVenda.getText();
        String precoCusto = txtPrecoDeCusto.getText();
        
        int itemSelecionado = boxHabilitarDesabilitar.getSelectedIndex();
        // Se for = 0 não está habilitado, 1 está.
        
            float precoV = 0.0f;
            float precoC = 0.0f;
        
        try {
            precoV = Float.parseFloat(precoVenda);
            precoC = Float.parseFloat(precoCusto);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Valor do Preço Inválido");
            return;
        }
        Produto produto = this.produto;
        
        if (produto == null){
        
        // Criar um objeto produto
        produto = new Produto(null, 
                nome,
                especificacoes,
                precoV,
                precoC,
                itemSelecionado == 0 ? false : true);
        
        } else {
            // Atualiza dados do produto
            produto.setNome(nome);
            produto.setEspecificacoes(especificacoes);
            produto.setPrecoCusto(precoC);
            produto.setPrecoVendas(precoV);
            produto.setHabilitadoVendas(itemSelecionado == 0? false : true);
        }
        
       // Chamar o controle para poder cadastar
       
       ControleCadastro controle = new ControleCadastro();
       if (this.produto == null){
           
           if(controle.cadastrarProduto(produto)){
           JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
            this.dispose();
            this.telaAnterior.toFront();
       } else {
           JOptionPane.showMessageDialog(this, "Cadastrado não realizado"
                   + "\n\nFaltando Dados");
       }
       } else {
                   if (controle.atualizarProduto(produto)){
                   JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
                   if (this.telaRelatorio != null){
                   System.out.println("Tentando repintar tela");
                   this.telaRelatorio.atualizarModelo();
                   }
                   this.dispose();
                   this.telaRelatorio.toFront();
                   } else{
                       JOptionPane.showMessageDialog(this, "Atualização não realizada!"
                               + "\n\nFaltando dados");
                   }
                   }
      
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        System.out.println("Cancelado");
        this.dispose();
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void boxHabilitarDesabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHabilitarDesabilitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxHabilitarDesabilitarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (this.produto != null) {
            carregarProdutoNosCampos();
        }
    }//GEN-LAST:event_formWindowActivated

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
private void carregarProdutoNosCampos() {
        
        txtNomeDoProduto.setText(this.produto.getNome());
        txtPrecoDeVenda.setText(this.produto.getPrecoVendas()+"");
        txtPrecoDeCusto.setText(this.produto.getPrecoCusto()+"");
        txtAreaEspecificacoes.setText(this.produto.getEspecificacoes());
        boxHabilitarDesabilitar.setSelectedIndex(this.produto.isHabilitadoVendas() ? 1 : 0);
        
        
    }

}

    
