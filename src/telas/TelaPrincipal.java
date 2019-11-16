package telas;

import controles.GerenteRepositorio;
import entidades.Produto;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

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

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/background.jpg"));
        Image image = icon.getImage();
        background = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(), this);
            }

        };
        btCadastrar = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

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

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        background.setLayer(btCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(btRelatorios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(btSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout backgroundLayout = new org.jdesktop.layout.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(btCadastrar)
                .add(67, 67, 67)
                .add(btRelatorios)
                .add(32, 32, 32)
                .add(btSair)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btCadastrar)
                    .add(btRelatorios)
                    .add(btSair))
                .addContainerGap(367, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, background)
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
    private javax.swing.JDesktopPane background;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton btSair;
    // End of variables declaration//GEN-END:variables
}
