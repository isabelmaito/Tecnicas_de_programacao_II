/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Conta.Agencia;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Agencias extends javax.swing.JFrame {

    /**
     * Creates new form Agencia
     */
    public Agencias() {
        initComponents();
    }

    Agencia agencia_tela = new Agencia();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        NomeAgencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EndAgencia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NumAgencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CompAgencia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BairroAgencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CEPAgencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CidadeAgencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        UFAgencia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        AgenciaAgencia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CNPJAgencia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        GerenteAgencia = new javax.swing.JTextField();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonDetalhes = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Nome");

        NomeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAgenciaActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço:");

        EndAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndAgenciaActionPerformed(evt);
            }
        });

        jLabel3.setText("Número:");

        NumAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumAgenciaActionPerformed(evt);
            }
        });

        jLabel5.setText("Complemento:");

        CompAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompAgenciaActionPerformed(evt);
            }
        });

        jLabel6.setText("Bairro:");

        BairroAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BairroAgenciaActionPerformed(evt);
            }
        });

        jLabel7.setText("CEP");

        CEPAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEPAgenciaActionPerformed(evt);
            }
        });

        jLabel8.setText("Cidade");

        CidadeAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeAgenciaActionPerformed(evt);
            }
        });

        jLabel9.setText("UF");

        UFAgencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MT", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        UFAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UFAgenciaActionPerformed(evt);
            }
        });

        jLabel11.setText("Agência");

        AgenciaAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgenciaAgenciaActionPerformed(evt);
            }
        });

        jLabel12.setText("CNPJ");

        CNPJAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNPJAgenciaActionPerformed(evt);
            }
        });

        jLabel13.setText("Gerente");

        GerenteAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenteAgenciaActionPerformed(evt);
            }
        });

        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonDetalhes.setText("Detalhes");
        ButtonDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDetalhesActionPerformed(evt);
            }
        });

        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UFAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CNPJAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AgenciaAgencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GerenteAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EndAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NumAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CompAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDetalhes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Limpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BairroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(13, 13, 13)
                                .addComponent(CEPAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CidadeAgencia)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(AgenciaAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(GerenteAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(EndAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NumAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CompAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(BairroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CEPAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CidadeAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(UFAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(CNPJAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrar)
                    .addComponent(ButtonDetalhes)
                    .addComponent(Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeAgenciaActionPerformed

    private void EndAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndAgenciaActionPerformed

    private void NumAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumAgenciaActionPerformed

    private void CompAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompAgenciaActionPerformed

    private void BairroAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BairroAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BairroAgenciaActionPerformed

    private void CEPAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEPAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CEPAgenciaActionPerformed

    private void CidadeAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeAgenciaActionPerformed

    private void UFAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UFAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UFAgenciaActionPerformed

    private void AgenciaAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgenciaAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgenciaAgenciaActionPerformed

    private void CNPJAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNPJAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNPJAgenciaActionPerformed

    private void GerenteAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenteAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GerenteAgenciaActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        try {
            agencia_tela.setNum_Agencia(AgenciaAgencia.getText());
            agencia_tela.setGerente(GerenteAgencia.getText());
            agencia_tela.setNome(NomeAgencia.getText());
            agencia_tela.setEndereco(EndAgencia.getText());
            agencia_tela.setNumero(NumAgencia.getText());
            agencia_tela.setComplemento(CompAgencia.getText());
            agencia_tela.setBairro(BairroAgencia.getText());
            agencia_tela.setCEP(CEPAgencia.getText());
            agencia_tela.setCidade(CidadeAgencia.getText());
            agencia_tela.setUF(UFAgencia.getSelectedItem().toString());
            agencia_tela.setCNPJ(CNPJAgencia.getText());
        } catch(Exception e){
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Agencia Cadastrada");
        this.setVisible(false);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDetalhesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ButtonDetalhesActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        AgenciaAgencia.setText(" ");
        NomeAgencia.setText(" ");
        EndAgencia.setText(" ");
        NumAgencia.setText(" ");
        CompAgencia.setText(" ");
        BairroAgencia.setText(" ");
        CEPAgencia.setText(" ");
        CidadeAgencia.setText(" ");
        UFAgencia.setSelectedIndex(0);
        GerenteAgencia.setText(" ");
        CNPJAgencia.setText(" ");

        // TODO add your handling code here:
    }//GEN-LAST:event_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgenciaAgencia;
    private javax.swing.JTextField BairroAgencia;
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonDetalhes;
    private javax.swing.JTextField CEPAgencia;
    private javax.swing.JTextField CNPJAgencia;
    private javax.swing.JTextField CidadeAgencia;
    private javax.swing.JTextField CompAgencia;
    private javax.swing.JTextField EndAgencia;
    private javax.swing.JTextField GerenteAgencia;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField NomeAgencia;
    private javax.swing.JTextField NumAgencia;
    private javax.swing.JComboBox<String> UFAgencia;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
