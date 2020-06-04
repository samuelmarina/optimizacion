
package View;

import Controller.Gama;
import Model.Cliente;
import Model.Constants;
import java.util.Timer;
import java.util.TimerTask;

public class Window extends javax.swing.JFrame {

    Gama gama;
    
    Constants k;
    
    public Window() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setVisible(true);
        k = Constants.shared();
        k.cajasIniciales = 3;
        k.carritosIniciales = 2;
        k.estantesIniciales = 2;
        gama = new Gama(this.estantesTxt, this.carritosTxt, this.cajasTxt, this.clientesColaTxt, 
            this.clientesSistemaTxt, this.horasLaboralesTxt, this.gananciasTxt, k);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        estantesTxt = new javax.swing.JTextField();
        estantesPlusBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        carritosMinusBtn = new javax.swing.JButton();
        carritosTxt = new javax.swing.JTextField();
        carritosPlusBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cajasMinusBtn = new javax.swing.JButton();
        cajasTxt = new javax.swing.JTextField();
        cajasPlusBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        clientesColaTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clientesSistemaTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        horasLaboralesTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gananciasTxt = new javax.swing.JTextField();
        startBtn = new javax.swing.JButton();
        importarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Estantes");

        estantesTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        estantesTxt.setText("0");
        estantesTxt.setEnabled(false);
        estantesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estantesTxtActionPerformed(evt);
            }
        });

        estantesPlusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        estantesPlusBtn.setText("+");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Carritos");

        carritosMinusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        carritosMinusBtn.setText("-");

        carritosTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        carritosTxt.setText("0");
        carritosTxt.setEnabled(false);
        carritosTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritosTxtActionPerformed(evt);
            }
        });

        carritosPlusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        carritosPlusBtn.setText("+");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Cajas");

        cajasMinusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cajasMinusBtn.setText("-");

        cajasTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cajasTxt.setText("0");
        cajasTxt.setEnabled(false);
        cajasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajasTxtActionPerformed(evt);
            }
        });

        cajasPlusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cajasPlusBtn.setText("+");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Clientes en Cola");

        clientesColaTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        clientesColaTxt.setText("0");
        clientesColaTxt.setEnabled(false);
        clientesColaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesColaTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Clientes en Sistema");

        clientesSistemaTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        clientesSistemaTxt.setText("0");
        clientesSistemaTxt.setEnabled(false);
        clientesSistemaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesSistemaTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Horas Laborales Cursadas");

        horasLaboralesTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        horasLaboralesTxt.setText("0");
        horasLaboralesTxt.setEnabled(false);
        horasLaboralesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasLaboralesTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Ganancias");

        gananciasTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        gananciasTxt.setText("0");
        gananciasTxt.setEnabled(false);
        gananciasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciasTxtActionPerformed(evt);
            }
        });

        startBtn.setText("Comenzar");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        importarBtn.setText("Importar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(clientesColaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(estantesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(estantesPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(carritosMinusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(carritosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(carritosPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(clientesSistemaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5))))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(horasLaboralesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cajasMinusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cajasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cajasPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(gananciasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315)
                        .addComponent(importarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(startBtn)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(estantesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estantesPlusBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carritosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carritosPlusBtn)
                            .addComponent(carritosMinusBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajasPlusBtn)
                            .addComponent(cajasMinusBtn))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientesColaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clientesSistemaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horasLaboralesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startBtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gananciasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(importarBtn)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estantesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estantesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estantesTxtActionPerformed

    private void carritosTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritosTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carritosTxtActionPerformed

    private void cajasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajasTxtActionPerformed

    private void clientesColaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesColaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesColaTxtActionPerformed

    private void clientesSistemaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesSistemaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientesSistemaTxtActionPerformed

    private void horasLaboralesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasLaboralesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasLaboralesTxtActionPerformed

    private void gananciasTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciasTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gananciasTxtActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        
        start();
    }//GEN-LAST:event_startBtnActionPerformed
    
    public void start(){
        TimerTask timerTask = new TimerTask()
     {      
         int i = 0;
         public void run() 
         {
             if(i == 3) this.cancel();
             Cliente c = new Cliente(i, gama);
             c.start();
             i += 1;
             
         }
     };
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cajasMinusBtn;
    private javax.swing.JButton cajasPlusBtn;
    private javax.swing.JTextField cajasTxt;
    private javax.swing.JButton carritosMinusBtn;
    private javax.swing.JButton carritosPlusBtn;
    private javax.swing.JTextField carritosTxt;
    private javax.swing.JTextField clientesColaTxt;
    private javax.swing.JTextField clientesSistemaTxt;
    private javax.swing.JButton estantesPlusBtn;
    private javax.swing.JTextField estantesTxt;
    private javax.swing.JTextField gananciasTxt;
    private javax.swing.JTextField horasLaboralesTxt;
    private javax.swing.JButton importarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
