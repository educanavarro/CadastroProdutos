package telas;

import controles.GerenteRepositorio;
import entidades.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaRelatorio extends javax.swing.JFrame  {
    private TelaPrincipal telaPrincipal;

    private TelaRelatorio() {
        initComponents();
        
        carregarTabela();
    }
    
    public TelaRelatorio(TelaPrincipal telaPrincipal) {
        this();
        this.telaPrincipal = telaPrincipal;
    }
    //Configuração da tabela
    private void carregarTabela() {
        ArrayList<Produto> lista = GerenteRepositorio.getInstance().obterListaProdutos();

        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Preço Venda");
        modelo.addColumn("Preço Custo");
        modelo.addColumn("Habilitado");

        if (lista.size() == 0) {
            modelo.addRow(new String[]{"Sem dados",
                        null,
                        null,
                        null,
                        null});
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Produto produto = lista.get(i);
            //System.out.println(produto.toString());


            // Linhas de dados da tabela
            modelo.addRow(new String[]{produto.getCodigo().toString(),
                        produto.getNome(),
                        produto.getPrecoVenda()+ "",
                        produto.getPrecoCusto() + "",
                        produto.isHabilitadoVendas() + ""});
        }

        tbRelatorio.setModel(modelo);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRelatorio = new javax.swing.JTable();
        txRelatorio = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRelatorio.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbRelatorio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbRelatorioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbRelatorioFocusLost(evt);
            }
        });
        tbRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbRelatorioMousePressed(evt);
            }
        });
        tbRelatorio.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbRelatorioInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tbRelatorio);

        txRelatorio.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txRelatorio.setText("Relatório produtos");

        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(txRelatorio)
                        .add(0, 287, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(btEditar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btDeletar)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(btVoltar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(txRelatorio)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 226, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btVoltar)
                    .add(btEditar)
                    .add(btDeletar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // Comando para voltar para o inicio:
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Comando para voltar para a tela principal fechando no "X":
        
        this.telaPrincipal.setEnabled(true);
        this.telaPrincipal.toFront();
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Print na lina de comando:
        System.out.println("Forma do Windows Ativo");
       
    }//GEN-LAST:event_formWindowActivated

    private void tbRelatorioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbRelatorioFocusGained
        // TODO add your handling code here:
                
    }//GEN-LAST:event_tbRelatorioFocusGained

    private void tbRelatorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRelatorioMousePressed
        // TODO add your handling code here:
        System.out.println("Mouse Pressionado");
        btEditar.setEnabled(true);
       
    }//GEN-LAST:event_tbRelatorioMousePressed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // Edição dos produtos já registrados:
        try {
            int linha = tbRelatorio.getSelectedRow();

            Produto produto = GerenteRepositorio.getInstance().obterListaProdutos().get(linha);
            System.out.println(produto.toString());

            this.setEnabled(false);
            btEditar.setEnabled(false);
            new TelaCadastro(this, produto).setVisible(true);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Selecione um produto!");
            btEditar.setEnabled(false);
        }     
    }//GEN-LAST:event_btEditarActionPerformed

    private void tbRelatorioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbRelatorioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRelatorioFocusLost

    private void tbRelatorioInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbRelatorioInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRelatorioInputMethodTextChanged

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        // Deletar dos produtos já registrados:
        try {
            int linha = tbRelatorio.getSelectedRow();

            Produto produto = GerenteRepositorio.getInstance().obterListaProdutos().get(linha);
            GerenteRepositorio.getInstance().removerProduto(produto);
            
            carregarTabela();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Selecione um produto!");
            btDeletar.setEnabled(false);
        }   
    }//GEN-LAST:event_btDeletarActionPerformed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }
    
    public void atualizarModelo() {
        
        System.out.println("Atualizando modelo...");
        carregarTabela();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRelatorio;
    private javax.swing.JLabel txRelatorio;
    // End of variables declaration//GEN-END:variables

}
