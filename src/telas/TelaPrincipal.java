package telas;

import controles.GerenteRepositorio;
import entidades.Produto;
import java.util.ArrayList;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        
        // Configura para centralizar a janela atual
        this.setLocationRelativeTo(null);
        
    }
    
    
    
    public void atualizaTable() {
        
        
        ArrayList<Produto> lista = GerenteRepositorio.getInstance().obterListaProdutos();
        for (int i = 0; i < lista.size(); i++) {
            Produto p = lista.get(i);
            p.toString();
        }
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btRelatorios.setText("Relatórios");
        btRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatoriosActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(btCadastrar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btRelatorios)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 132, Short.MAX_VALUE)
                .add(btSair)
                .add(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btSair)
                    .add(btCadastrar)
                    .add(btRelatorios))
                .addContainerGap(387, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        // Usuario clicou no botao Sair
        System.exit(0);
        
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
       
        // Desabilitando tela atual para não ser clicável
        this.setEnabled(false);
        
        // Botão Cadastrar pressionado
        new TelaCadastro(this).setVisible(true);
        
        

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatoriosActionPerformed
        // TODO add your handling code here:
        
        this.setEnabled(false);
        
        new TelaRelatorio(this).setVisible(true);
    }//GEN-LAST:event_btRelatoriosActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton btSair;
    // End of variables declaration//GEN-END:variables
}
