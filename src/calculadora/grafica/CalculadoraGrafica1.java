package calculadora.grafica;

    public class CalculadoraGrafica1 extends javax.swing.JFrame {
        int conta1 = 0;
        String num1 = "";
        String num2 = "";
        int mais = 0;
        int menos = 0;
        int div = 0;
        int mult = 0;
        
        public CalculadoraGrafica1() {
        
        initComponents();   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoMENOS = new javax.swing.JButton();
        jNum = new javax.swing.JTextField();
        botaoMAIS = new javax.swing.JButton();
        botaoX = new javax.swing.JButton();
        botaoDIV = new javax.swing.JButton();
        botaoUM = new javax.swing.JButton();
        botaoDOIS = new javax.swing.JButton();
        botaoTRES = new javax.swing.JButton();
        botaoQUATRO = new javax.swing.JButton();
        botaoCINCO = new javax.swing.JButton();
        botaoSEIS = new javax.swing.JButton();
        botaoSETE = new javax.swing.JButton();
        botaoOITO = new javax.swing.JButton();
        botaoNOVE = new javax.swing.JButton();
        botaoZERO = new javax.swing.JButton();
        botaoPONTO = new javax.swing.JButton();
        botaoIGUAL = new javax.swing.JButton();
        botaoMENOS1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoMENOS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoMENOS.setText("-");
        botaoMENOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMENOSActionPerformed(evt);
            }
        });

        jNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumActionPerformed(evt);
            }
        });

        botaoMAIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoMAIS.setText("+");
        botaoMAIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMAISActionPerformed(evt);
            }
        });

        botaoX.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoX.setText("x");
        botaoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoXActionPerformed(evt);
            }
        });

        botaoDIV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoDIV.setText("/");
        botaoDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDIVActionPerformed(evt);
            }
        });

        botaoUM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoUM.setText("1");
        botaoUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUMActionPerformed(evt);
            }
        });

        botaoDOIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoDOIS.setText("2");
        botaoDOIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDOISActionPerformed(evt);
            }
        });

        botaoTRES.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoTRES.setText("3");
        botaoTRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTRESActionPerformed(evt);
            }
        });

        botaoQUATRO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoQUATRO.setText("4");
        botaoQUATRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQUATROActionPerformed(evt);
            }
        });

        botaoCINCO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoCINCO.setText("5");
        botaoCINCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCINCOActionPerformed(evt);
            }
        });

        botaoSEIS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoSEIS.setText("6");
        botaoSEIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSEISActionPerformed(evt);
            }
        });

        botaoSETE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoSETE.setText("7");
        botaoSETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSETEActionPerformed(evt);
            }
        });

        botaoOITO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoOITO.setText("8");
        botaoOITO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOITOActionPerformed(evt);
            }
        });

        botaoNOVE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoNOVE.setText("9");
        botaoNOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNOVEActionPerformed(evt);
            }
        });

        botaoZERO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoZERO.setText("0");
        botaoZERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoZEROActionPerformed(evt);
            }
        });

        botaoPONTO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoPONTO.setText(".");
        botaoPONTO.setToolTipText("");
        botaoPONTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPONTOActionPerformed(evt);
            }
        });

        botaoIGUAL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoIGUAL.setText("=");
        botaoIGUAL.setToolTipText("");
        botaoIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIGUALActionPerformed(evt);
            }
        });

        botaoMENOS1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoMENOS1.setText("C");
        botaoMENOS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMENOS1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoQUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoMAIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jNum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(botaoUM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botaoDOIS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(botaoTRES, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(botaoMENOS1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoPONTO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoSETE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoOITO, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoNOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMENOS1)
                    .addComponent(botaoMENOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoUM)
                    .addComponent(botaoDOIS)
                    .addComponent(botaoTRES)
                    .addComponent(botaoDIV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoQUATRO)
                    .addComponent(botaoCINCO)
                    .addComponent(botaoSEIS)
                    .addComponent(botaoMAIS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSETE)
                            .addComponent(botaoOITO)
                            .addComponent(botaoNOVE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoZERO)
                            .addComponent(botaoPONTO)))
                    .addComponent(botaoIGUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMENOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMENOSActionPerformed
        conta1++;
        menos++;
    }//GEN-LAST:event_botaoMENOSActionPerformed

    private void botaoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoXActionPerformed
        conta1++;
        mult++;
    }//GEN-LAST:event_botaoXActionPerformed

    private void botaoDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDIVActionPerformed
        conta1++;
        div++;
    }//GEN-LAST:event_botaoDIVActionPerformed

    private void jNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumActionPerformed

    }//GEN-LAST:event_jNumActionPerformed

    private void botaoUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUMActionPerformed
        if (conta1 == 0){
           num1 += "1";
           jNum.setText(num1);
        } else {
           num2 += "1";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoUMActionPerformed

    private void botaoDOISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDOISActionPerformed
        if (conta1 == 0){
           num1 += "2";
           jNum.setText(num1);
        } else {
           num2 += "2";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoDOISActionPerformed

    private void botaoTRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTRESActionPerformed
        if (conta1 == 0){
           num1 += "3";
           jNum.setText(num1);
        } else {
           num2 += "3";
           jNum.setText(num2);
        }   
    }//GEN-LAST:event_botaoTRESActionPerformed

    private void botaoQUATROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQUATROActionPerformed
        if (conta1 == 0){
           num1 += "4";
           jNum.setText(num1);
        } else {
           num2 += "4";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoQUATROActionPerformed

    private void botaoCINCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCINCOActionPerformed
        if (conta1 == 0){
           num1 += "5";
           jNum.setText(num1);
        } else {
           num2 += "5";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoCINCOActionPerformed

    private void botaoSEISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSEISActionPerformed
        if (conta1 == 0){
           num1 += "6";
           jNum.setText(num1);
        } else {
           num2 += "6";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoSEISActionPerformed

    private void botaoSETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSETEActionPerformed
        if (conta1 == 0){
           num1 += "7";
           jNum.setText(num1);
        } else {
           num2 += "7";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoSETEActionPerformed

    private void botaoOITOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOITOActionPerformed
        if (conta1 == 0){
           num1 += "8";
           jNum.setText(num1);
        } else {
           num2 += "8";
           jNum.setText(num2);
        }   
    }//GEN-LAST:event_botaoOITOActionPerformed

    private void botaoNOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNOVEActionPerformed
        if (conta1 == 0){
           num1 += "9";
           jNum.setText(num1);
        } else {
           num2 += "9";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoNOVEActionPerformed

    private void botaoZEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoZEROActionPerformed
        if (conta1 == 0){
           num1 += "0";
           jNum.setText(num1);
        } else {
           num2 += "0";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoZEROActionPerformed

    private void botaoPONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPONTOActionPerformed
        if (conta1 == 0){
           num1 += ".";
           jNum.setText(num1);
        } else {
           num2 += ".";
           jNum.setText(num2);
        }
    }//GEN-LAST:event_botaoPONTOActionPerformed

    private void botaoIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIGUALActionPerformed
        if (mais != 0){
            double maiss = ((Double.parseDouble(num1)) + (Double.parseDouble(num2)));
            num1 = (String.valueOf(maiss));
            jNum.setText(String.valueOf(maiss));
            num2 = "";
            conta1 = 0;
            
        }
        else if (menos != 0){
            double menoss = ((Double.parseDouble(num1)) - (Double.parseDouble(num2)));
            num1 = String.valueOf(menoss);
            jNum.setText(String.valueOf(menoss));    
            num2 = "";
            conta1 = 0;
        }
        else if (mult != 0){
            double multt = ((Double.parseDouble(num1)) * (Double.parseDouble(num2)));
            num1 = String.valueOf(multt);
            jNum.setText(String.valueOf(multt));
            num2 = "";
            conta1 = 0;
        }
        else if (div != 0){
            double divv = ((Double.parseDouble(num1)) / (Double.parseDouble(num2)));
            num1 = String.valueOf(divv);
            jNum.setText(String.valueOf(divv));
            num2 = "";
            conta1 = 0;
        }    
    }//GEN-LAST:event_botaoIGUALActionPerformed

    private void botaoMAISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMAISActionPerformed
        conta1++;
        mais++;
        
    }//GEN-LAST:event_botaoMAISActionPerformed

    private void botaoMENOS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMENOS1ActionPerformed
        conta1 = 0;
        num1 = "";
        num2 = "";
        jNum.setText("");
    }//GEN-LAST:event_botaoMENOS1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(CalculadoraGrafica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraGrafica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrafica1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCINCO;
    private javax.swing.JButton botaoDIV;
    private javax.swing.JButton botaoDOIS;
    private javax.swing.JButton botaoIGUAL;
    private javax.swing.JButton botaoMAIS;
    private javax.swing.JButton botaoMENOS;
    private javax.swing.JButton botaoMENOS1;
    private javax.swing.JButton botaoNOVE;
    private javax.swing.JButton botaoOITO;
    private javax.swing.JButton botaoPONTO;
    private javax.swing.JButton botaoQUATRO;
    private javax.swing.JButton botaoSEIS;
    private javax.swing.JButton botaoSETE;
    private javax.swing.JButton botaoTRES;
    private javax.swing.JButton botaoUM;
    private javax.swing.JButton botaoX;
    private javax.swing.JButton botaoZERO;
    private javax.swing.JTextField jNum;
    // End of variables declaration//GEN-END:variables
}
