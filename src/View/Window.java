
package View;

import Controller.Gama;
import Model.Cliente;
import Model.Constants;
import Model.Jefe;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Window extends javax.swing.JFrame {

    Gama gama;
    
    Constants k;
    
    public Window() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setVisible(true);    
        
        //Inhabilitamos todos los botones de +/- al comienzo
        this.estantesPlusBtn.setEnabled(false);
        this.carritosMinusBtn.setEnabled(false);
        this.carritosPlusBtn.setEnabled(false);
        this.cajasMinusBtn.setEnabled(false);
        this.cajasPlusBtn.setEnabled(false);
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
        rutaTxt = new javax.swing.JTextField();
        abrirArchivoBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Estantes");

        estantesTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        estantesTxt.setText("1");
        estantesTxt.setEnabled(false);
        estantesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estantesTxtActionPerformed(evt);
            }
        });

        estantesPlusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        estantesPlusBtn.setText("+");
        estantesPlusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estantesPlusBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Carritos");

        carritosMinusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        carritosMinusBtn.setText("-");
        carritosMinusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritosMinusBtnActionPerformed(evt);
            }
        });

        carritosTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        carritosTxt.setText("10");
        carritosTxt.setEnabled(false);
        carritosTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritosTxtActionPerformed(evt);
            }
        });

        carritosPlusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        carritosPlusBtn.setText("+");
        carritosPlusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritosPlusBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Cajas");

        cajasMinusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cajasMinusBtn.setText("-");
        cajasMinusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajasMinusBtnActionPerformed(evt);
            }
        });

        cajasTxt.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cajasTxt.setText("4");
        cajasTxt.setEnabled(false);
        cajasTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajasTxtActionPerformed(evt);
            }
        });

        cajasPlusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cajasPlusBtn.setText("+");
        cajasPlusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajasPlusBtnActionPerformed(evt);
            }
        });

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

        startBtn.setText("Comenzar sin archivo");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        importarBtn.setText("Comenzar con archivo");
        importarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarBtnActionPerformed(evt);
            }
        });

        rutaTxt.setText("Ingrese la ruta del archivo a importar");
        rutaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaTxtActionPerformed(evt);
            }
        });

        abrirArchivoBtn.setText("Abrir archivo");
        abrirArchivoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArchivoBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Control del jefe");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Clientes en la simulación");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Control de unidades");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel11.setText("Simulador de clientes en supermercados Gama");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(clientesColaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientesSistemaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horasLaboralesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(estantesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(estantesPlusBtn)
                                        .addGap(78, 78, 78)
                                        .addComponent(carritosMinusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(carritosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(carritosPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cajasMinusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(190, 190, 190)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cajasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajasPlusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(33, 33, 33)
                                                .addComponent(gananciasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(abrirArchivoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(importarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel11)
                .addGap(51, 51, 51)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estantesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estantesPlusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carritosMinusBtn)
                    .addComponent(carritosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carritosPlusBtn)
                    .addComponent(cajasMinusBtn)
                    .addComponent(cajasPlusBtn))
                .addGap(33, 33, 33)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientesColaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(clientesSistemaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gananciasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasLaboralesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(78, 78, 78)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrirArchivoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        //Se inicializa el programa con las constantes dadas en el ejercicio
        k = Constants.shared();
        k.prepare(5, 1, 3, 10, 4, 10, 10, 20);
//        k.prepare(1, 1, 3, 3, 4, 8, 10, 20);
        gama = new Gama(this.estantesTxt, this.carritosTxt, this.cajasTxt, this.clientesColaTxt, 
            this.clientesSistemaTxt, this.horasLaboralesTxt, this.gananciasTxt, k);
        carritosTxt.setText(""+k.carritosIniciales);
        cajasTxt.setText(""+k.cajasIniciales);
        estantesTxt.setText(""+k.estantesIniciales);
        start(); 
        
    }//GEN-LAST:event_startBtnActionPerformed

    private void importarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarBtnActionPerformed
        
        if(cargarArchivo()){
            start();
        }
        
    }//GEN-LAST:event_importarBtnActionPerformed

    private void carritosPlusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritosPlusBtnActionPerformed
            
        if(!gama.agregarCarrito()) JOptionPane.showMessageDialog(null, "Llegó al máximo de carritos");
        
    }//GEN-LAST:event_carritosPlusBtnActionPerformed

    private void carritosMinusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritosMinusBtnActionPerformed
        
        Thread aux = new Thread(){
            @Override
            public void run(){
                gama.eliminarCarrito();
            }
        };
        aux.start();
        
        if(!gama.eliminarCarrito()) JOptionPane.showMessageDialog(null, "Llegó al mínimo de carritos");
    }//GEN-LAST:event_carritosMinusBtnActionPerformed

    private void estantesPlusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estantesPlusBtnActionPerformed
        
        gama.agregarEstante();
//        if(!); JOptionPane.showMessageDialog(null, "Llego al maximo de estantes");
    
    }//GEN-LAST:event_estantesPlusBtnActionPerformed

    private void cajasPlusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajasPlusBtnActionPerformed
       
        if(!gama.agregarCaja()) JOptionPane.showMessageDialog(null, "Llego al maximo de cajas");
        
    }//GEN-LAST:event_cajasPlusBtnActionPerformed

    private void cajasMinusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajasMinusBtnActionPerformed

        if(!gama.eliminarCaja()) JOptionPane.showMessageDialog(null, "Llegó al mínimo de cajas");
        
    }//GEN-LAST:event_cajasMinusBtnActionPerformed

    private void rutaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaTxtActionPerformed

    private void abrirArchivoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArchivoBtnActionPerformed
        
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if(archivo != null){
            rutaTxt.setText(archivo.getAbsolutePath());
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo seleccionado");
        }
        
    }//GEN-LAST:event_abrirArchivoBtnActionPerformed
    
    /**
     * Utiliza un txt con cierto formato para cargar las 
     * constantes del programa
     */
    public boolean cargarArchivo() {
        
        String archivo = rutaTxt.getText();
        try {

            BufferedReader in = new BufferedReader(new FileReader(archivo));

            int horasCargadas = Integer.parseInt(in.readLine());
            int estantesInicialesCargados = Integer.parseInt(in.readLine());
            int maxEstantesCargados = Integer.parseInt(in.readLine());
            int capacidadMaxCargada = Integer.parseInt(in.readLine());
            int cajasInicialesCargadas = Integer.parseInt(in.readLine());
            int maxCajasCargadas = Integer.parseInt(in.readLine());
            int carritosInicialesCargados = Integer.parseInt(in.readLine());
            int maxCarritosCargados = Integer.parseInt(in.readLine());

            k = Constants.shared();
            k.prepare(horasCargadas, estantesInicialesCargados, maxEstantesCargados, capacidadMaxCargada, cajasInicialesCargadas, maxCajasCargadas, carritosInicialesCargados, maxCarritosCargados);
            gama = new Gama(this.estantesTxt, this.carritosTxt, this.cajasTxt, this.clientesColaTxt,
                    this.clientesSistemaTxt, this.horasLaboralesTxt, this.gananciasTxt, k);
            carritosTxt.setText("" + k.carritosIniciales);
            cajasTxt.setText("" + k.cajasIniciales);
            estantesTxt.setText("" + k.estantesIniciales);


        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al cargar el archivo, intente de nuevo.");
            return false;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al cargar el archivo, intente de nuevo.");
            return false;
        }
        
        return true;
    
    }
    
    /**
     * Da inicio a la llegada de clientes al Gama
     */
    public void start(){
        this.estantesPlusBtn.setEnabled(true);
        this.carritosMinusBtn.setEnabled(true);
        this.carritosPlusBtn.setEnabled(true);
        this.cajasMinusBtn.setEnabled(true);
        this.cajasPlusBtn.setEnabled(true);
        
        this.abrirArchivoBtn.setEnabled(false);
        startBtn.setEnabled(false);
        importarBtn.setEnabled(false);
        rutaTxt.setEnabled(false);
        
        TimerTask timerTask = new TimerTask()
     {      
         int i = 0;
         public void run() 
         {
             Cliente c = new Cliente(i, gama);
             c.start();
             i += 1;
             
         }
     };
        
        Jefe j = new Jefe(gama);
        j.start();
        
        Timer timer = new Timer();
        int ret = (int)(0.083 * k.hora * 1000);
        timer.scheduleAtFixedRate(timerTask, 0, ret);
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
    private javax.swing.JButton abrirArchivoBtn;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField rutaTxt;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
