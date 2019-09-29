package telas;

import controles.GerenteRepositorio;
import entidades.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaRelatorio extends javax.swing.JFrame {
    private TelaPrincipal telaPrincipal;

    
    public TelaRelatorio() {
        initComponents();
        
        carregarTabela();
    }
    
    public TelaRelatorio(TelaPrincipal telaPrincipal) {
        this();
        this.telaPrincipal = telaPrincipal;
    }
    
    private void carregarTabela(){
    ArrayList<Produto> lista = GerenteRepositorio.getInstance().obterListaProdutos();
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Preço Venda");
        modelo.addColumn("Preço Custo");
        modelo.addColumn("Habilitado");
        
        if (lista.size() == 0){
        modelo.addRow(new String []{"Sem dados",
                null, 
                null,
                null,
                null});
        }
        for (int i=0; i < lista.size(); i++){
            Produto produto = lista.get(i);
            //System.out.println(produto.toString());

            // Linhas de dados da tabela
            modelo.addRow(new String[] {produto.getCodigo().toString(),
                produto.getNome(),
                produto.getPrecoVendas() + "",
                produto.getPrecoCusto() + "",
                produto.isHabilitadoVendas() + ""});
        }
        tabelaRelatorio.setModel(modelo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        botaoEditar = new javax.swing.JButton();
        lbRelatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaRelatorio);

        botaoEditar.setText("Editar");
        botaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botaoEditarMousePressed(evt);
            }
        });
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        lbRelatorio.setText("Relatório de Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbRelatorio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoEditar)
                                .addGap(239, 239, 239)
                                .addComponent(botaoCancelar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // TODO add your handling code here:
        try {
            int linha = tabelaRelatorio.getSelectedRow();

            Produto produto = GerenteRepositorio.getInstance().obterListaProdutos().get(linha);
            System.out.println(produto.toString());

            this.setEnabled(false);
            botaoEditar.setEnabled(false);
            new TelaCadastro(this, produto).setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Selecione um produto!");
            botaoEditar.setEnabled(false);
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        this.telaPrincipal.setEnabled(true);
        // NOVO CODIGO
        this.telaPrincipal.toFront();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        System.out.println("form window activated");
    }//GEN-LAST:event_formWindowActivated

    private void botaoEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEditarMousePressed
        // TODO add your handling code here:
        System.out.println("jTable1MousePressed ");
        botaoEditar.setEnabled(true);
    }//GEN-LAST:event_botaoEditarMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRelatorio;
    private javax.swing.JTable tabelaRelatorio;
    // End of variables declaration//GEN-END:variables
}
