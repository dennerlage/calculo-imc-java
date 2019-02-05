/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import CalculoImc.Imc;
import java.text.DecimalFormat;

/**
 *
 * @author Aluno
 */
public class PainelPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public PainelPrincipal() {
        initComponents();
        labelVlrImc.setText("");
        labelSituacaoImc.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpPeso = new javax.swing.JTextField();
        cpAltura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelVlrImc = new javax.swing.JLabel();
        labelSituacaoImc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        jLabel1.setText("Peso : ");

        jLabel2.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        jLabel2.setText("Altura : ");

        cpPeso.setFont(new java.awt.Font("XOUMEG S57", 0, 18)); // NOI18N
        cpPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpPesoActionPerformed(evt);
            }
        });

        cpAltura.setFont(new java.awt.Font("XOUMEG S57", 0, 18)); // NOI18N
        cpAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpAlturaActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular IMC");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        jLabel3.setText("Valor do IMC : ");

        jLabel4.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        jLabel4.setText("Situação do IMC : ");

        labelVlrImc.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        labelVlrImc.setText("valor_imc");

        labelSituacaoImc.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        labelSituacaoImc.setText("situação_imc");

        jLabel5.setFont(new java.awt.Font("XOUMEG S57", 0, 48)); // NOI18N
        jLabel5.setText("BEM - VINDO AO IMC FF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpAltura))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSituacaoImc))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelVlrImc)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 65, Short.MAX_VALUE))
                            .addComponent(cpPeso))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelVlrImc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelSituacaoImc))
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpAlturaActionPerformed

    private void cpPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpPesoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String strPeso = cpPeso.getText();
        String strAltura = cpAltura.getText();
        
        strPeso = strPeso.replaceAll(",", ".");
        strAltura = strAltura.replaceAll(",", ".");
        
        double peso = Double.parseDouble(strPeso);
        double altura = Double.parseDouble(strAltura);
        
        Imc im = new Imc();
        double vlrImc = im.calcular(peso,altura);
        
        DecimalFormat df = new DecimalFormat("#.00");
        String numeroFormatado = df.format(vlrImc);
        labelVlrImc.setText(""+numeroFormatado);
        
        if(vlrImc < 18.5){
            labelSituacaoImc.setText("Abaixo do peso");
        }
        else if(vlrImc >= 18.5 && vlrImc <= 24.99){
            labelSituacaoImc.setText("Normal");
        }
        else if(vlrImc >= 25 && vlrImc <= 29.99){
            labelSituacaoImc.setText("Sobrepeso");
        }
        else if(vlrImc >= 30 & vlrImc <= 34.9){
            labelSituacaoImc.setText("Obeso Grau I");
        }
        else if (vlrImc >= 35 & vlrImc <= 39.9){
            
            labelSituacaoImc.setText("Obeso Grau II");
        }
        else if (vlrImc > 39.9){
            labelSituacaoImc.setText("Obeso Grau III");
        }
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField cpAltura;
    private javax.swing.JTextField cpPeso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSituacaoImc;
    private javax.swing.JLabel labelVlrImc;
    // End of variables declaration//GEN-END:variables
}
