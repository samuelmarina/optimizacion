/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author SamuelLMiller
 */
public class Gama {
    //Cola para entrar
    Queue colaClientes = new LinkedList<>();
    public Semaphore semColaEntrar;
    
    //Clientes en sistema
    Queue clientesSistema = new LinkedList<>();
    
    //Cola para cajas registradoras
    Queue colaCajas = new LinkedList<>();
    Semaphore semCajasR;
    
    //Estantes
    int estantes;
    Semaphore semEstantes;
    
    int ganancias;
    int carritos;
    int cajas;
    double horasLaborales;
    
    //TextFields
    public JTextField estantesTxt;
    public JTextField carritosTxt;
    public JTextField cajasTxt;
    public JTextField clientesColaTxt;
    public JTextField clientesSistemaTxt;
    public JTextField horasLaboralesTxt;
    public JTextField gananciasTxt;
    
    public Gama(int carritos, int cajas, int estantes, JTextField estantesTxt, JTextField carritosTxt, JTextField cajasTxt,
            JTextField clientesColaTxt, JTextField clientesSistemaTxt, JTextField horasLaboralesTxt, JTextField gananciasTxt){
        this.carritos = carritos;
        this.cajas = cajas;
        this.estantes = estantes;
        
        this.semColaEntrar = new Semaphore(carritos);
        this.semCajasR = new Semaphore(cajas);
        this.semEstantes = new Semaphore(1);
        
        this.estantesTxt = estantesTxt;
        this.carritosTxt = carritosTxt;
        this.cajasTxt = cajasTxt;
        this.clientesColaTxt = clientesColaTxt;
        this.clientesSistemaTxt = clientesSistemaTxt;
        this.horasLaboralesTxt = horasLaboralesTxt;
        this.gananciasTxt = gananciasTxt;
    }
    
    public boolean isClientesPendiente(){
        return colaClientes.size() > 0;
    }
    
}
