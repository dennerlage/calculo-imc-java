
package telas;

import CalculoImc.Imc;
import CalculoImc.ManipulacaoDeArquivos;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        LabelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        btGravarImc = new javax.swing.JButton();
        LabelNome1 = new javax.swing.JLabel();
        LabelNome2 = new javax.swing.JLabel();
        cpCPF = new javax.swing.JFormattedTextField();

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

        LabelNome.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        LabelNome.setText("Nome : ");

        cpNome.setFont(new java.awt.Font("XOUMEG S57", 0, 18)); // NOI18N
        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        btGravarImc.setText("Salvar Imc");
        btGravarImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarImcActionPerformed(evt);
            }
        });

        LabelNome1.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        LabelNome1.setText("Nome : ");

        LabelNome2.setFont(new java.awt.Font("XOUMEG S57", 0, 24)); // NOI18N
        LabelNome2.setText("Cpf : ");

        try {
            cpCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelSituacaoImc))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelVlrImc))
                                    .addComponent(LabelNome1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(LabelNome2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cpPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cpCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cpAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btGravarImc, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNome, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome2)
                    .addComponent(cpCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btGravarImc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(LabelNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcular)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelVlrImc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelSituacaoImc))
                .addContainerGap(169, Short.MAX_VALUE))
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

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void btGravarImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarImcActionPerformed
        // TODO add your handling code here:
        ManipulacaoDeArquivos m = new ManipulacaoDeArquivos("C:\\Users\\Suporte\\Documents\\NetBeansProjects", "Trab.csv");
        String gravar = "";
        gravar += cpNome.getText();
        gravar += ";";
        gravar += cpPeso.getText();
        gravar += " Quilos";
        gravar += ";";
        gravar += cpAltura.getText();
        gravar += " Metros";
        gravar += ";";
        gravar += labelVlrImc.getText();
        gravar += ";";
        gravar += labelSituacaoImc.getText();
        gravar += ";";
        gravar += cpCPF.getText();
        gravar += "\n";
        try {
            m.gravar(gravar);
        } catch (IOException ex) {
            Logger.getLogger(PainelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btGravarImcActionPerformed

    private void cpCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpCPFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNome1;
    private javax.swing.JLabel LabelNome2;
    private javax.swing.JButton btGravarImc;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField cpAltura;
    private javax.swing.JFormattedTextField cpCPF;
    private javax.swing.JTextField cpNome;
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
