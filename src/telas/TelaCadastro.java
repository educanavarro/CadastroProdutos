
package telas;

import controles.ControleCadastro;
import entidades.Produto;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class TelaCadastro extends javax.swing.JFrame {

    private TelaPrincipal telaAnterior;
    private TelaRelatorio telaRelatorios;
    private Produto produto;
    

    private TelaCadastro() {
        initComponents();

    }
    
    
    public TelaCadastro(TelaPrincipal telaAnterior) {
        
        // Chamar o construtor padrão
        this();
        this.telaAnterior = telaAnterior;
        
    }
    
    public TelaCadastro(TelaRelatorio telaRelatorios, Produto produto) {
        this();
        
        this.telaRelatorios = telaRelatorios;
        this.produto = produto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lbPrecoVenda = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        txtPrecoCusto = new javax.swing.JTextField();
        lbNomeProduto = new javax.swing.JLabel();
        lbEspecificacoes = new javax.swing.JLabel();
        lbPrecoCusto = new javax.swing.JLabel();
        jcpEspecificaoes = new javax.swing.JScrollPane();
        txtEspecificacoes = new javax.swing.JTextArea();
        cbHabilitar = new javax.swing.JComboBox();
        lbHabilitar = new javax.swing.JLabel();

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

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lbPrecoVenda.setText("Preço Venda");

        txtNomeProduto.setToolTipText("Informe o nome do produto");

        txtPrecoVenda.setToolTipText("Informe o preço Venda");

        txtPrecoCusto.setToolTipText("Informe o preço de custo");

        lbNomeProduto.setText("Nome produto");

        lbEspecificacoes.setText("Especificação técnica");

        lbPrecoCusto.setText("Preço Custo");

        txtEspecificacoes.setColumns(20);
        txtEspecificacoes.setRows(5);
        txtEspecificacoes.setToolTipText("informe as especificacoes");
        jcpEspecificaoes.setViewportView(txtEspecificacoes);

        cbHabilitar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Desabilitado", "Habilitado" }));

        lbHabilitar.setText("Habilitar vendas:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtNomeProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 428, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbNomeProduto)))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jcpEspecificaoes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbEspecificacoes))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(txtPrecoVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 172, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(lbPrecoCusto)
                                .add(lbPrecoVenda)
                                .add(txtPrecoCusto)
                                .add(lbHabilitar)
                                .add(cbHabilitar, 0, 173, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(btSalvar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btCancelar)))))
                .add(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(lbNomeProduto)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtNomeProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lbPrecoVenda)
                    .add(lbEspecificacoes))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(txtPrecoVenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(lbPrecoCusto)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtPrecoCusto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lbHabilitar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbHabilitar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jcpEspecificaoes))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 39, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btCancelar)
                    .add(btSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        System.out.println("Salvar aqui");
        
        String nome = txtNomeProduto.getText();
        String especificacoes = txtEspecificacoes.getText();
        
        String precoVenda = txtPrecoVenda.getText();
        String precoCusto = txtPrecoCusto.getText();
        
        int itemSelecionado = cbHabilitar.getSelectedIndex();
        // Se for = 0 não está habilitado, 1 está.
        
        float precoV = 0.0f;
        float precoC = 0.0f;
        
        try {
            precoV = Float.parseFloat(precoVenda);
            precoC = Float.parseFloat(precoCusto);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, 
                    "Preço inválido");
            
            return;
        }
        
        Produto produto = this.produto;
        
        if (produto == null) {

            // Criar um objeto Produto
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
            produto.setPrecoVenda(precoV);
            produto.setHabilitadoVendas(itemSelecionado == 0 ? false : true);
            
        }
        
        // Chamar o controle para poder cadastar
        
        ControleCadastro controlador = new ControleCadastro();
        if (this.produto == null) {


            if (controlador.cadastrarProduto(produto)) {
                JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");

                this.dispose();
                this.telaAnterior.toFront();
                
            } else {
                JOptionPane.showMessageDialog(this, "Cadastro Não realizado. "
                        + "\n\nFaltando dados");
            }

        } else {
            
            
            if (controlador.atualizarProduto(produto)) {
                JOptionPane.showMessageDialog(this, "Atualizado com sucesso");
                if (this.telaRelatorios != null) {
                    System.out.println("tentando repintar tela");
                    this.telaRelatorios.atualizarModelo();
                }
                this.dispose();
                this.telaRelatorios.toFront();
                
            } else {
                JOptionPane.showMessageDialog(this, "Atualização não realizada. "
                        + "\n\nFaltando dados");
            } 
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Operação para fechar a janela:
        System.out.println("Fechando janela de cadastro");
        
        if (this.produto == null) {
        
           // Configuração para poder habilitar a janela principal. 
           telaAnterior.setEnabled(true);
           telaAnterior.toFront();
        } else {
            
           telaRelatorios.setEnabled(true); 
           telaRelatorios.toFront();
        }
    }//GEN-LAST:event_formWindowClosed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        System.out.println("Cancelar aqui");
        this.dispose();
        
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carregar produtos:
        
        if (this.produto != null) {
            carregarProdutoNosCampos();
        }
    }//GEN-LAST:event_formWindowActivated

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

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cbHabilitar;
    private javax.swing.JScrollPane jcpEspecificaoes;
    private javax.swing.JLabel lbEspecificacoes;
    private javax.swing.JLabel lbHabilitar;
    private javax.swing.JLabel lbNomeProduto;
    private javax.swing.JLabel lbPrecoCusto;
    private javax.swing.JLabel lbPrecoVenda;
    private javax.swing.JTextArea txtEspecificacoes;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoCusto;
    private javax.swing.JTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutoNosCampos() {
        
        txtNomeProduto.setText(this.produto.getNome());
        txtPrecoVenda.setText(this.produto.getPrecoVenda()+"");
        txtPrecoCusto.setText(this.produto.getPrecoCusto()+"");
        txtEspecificacoes.setText(this.produto.getEspecificacoes());
        cbHabilitar.setSelectedIndex(this.produto.isHabilitadoVendas() ? 1 : 0);
        }
}