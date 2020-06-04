/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Constants;
import java.util.HashSet;
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
    public Queue<Cliente> colaClientes = new LinkedList<>();
    public Semaphore semColaEntrar;
    
    //Clientes en sistema
    public HashSet<Cliente> clientesSistema = new HashSet<>();
    
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
    
    public Constants k;
    
    public Gama(JTextField f){
        
    }
    
    public Gama(JTextField estantesTxt, JTextField carritosTxt, JTextField cajasTxt,
            JTextField clientesColaTxt, JTextField clientesSistemaTxt, JTextField horasLaboralesTxt, JTextField gananciasTxt, Constants k){
        this.k = k;
        this.carritos = k.carritosIniciales;
        this.cajas = k.cajasIniciales;
        this.estantes = k.estantesIniciales;
        
        this.semColaEntrar = new Semaphore(k.carritosIniciales);
        this.semCajasR = new Semaphore(k.cajasIniciales);
        this.semEstantes = new Semaphore(1);
        
        this.estantesTxt = estantesTxt;
        this.carritosTxt = carritosTxt;
        this.cajasTxt = cajasTxt;
        this.clientesColaTxt = clientesColaTxt;
        this.clientesSistemaTxt = clientesSistemaTxt;
        this.horasLaboralesTxt = horasLaboralesTxt;
        this.gananciasTxt = gananciasTxt;
    }
    
    /**
     * Agrega un nuevo cliente a la cola y actualiza el TextField
     * @param cliente : cliente a agregar
     */
    public void nuevoCliente(Cliente cliente){
        colaClientes.add(cliente);
        clientesColaTxt.setText(""+colaClientes.size()); //Verificar si colocar size o aumentar en 1
        entrarSistema();
    }
    
    /**
     * Comprueba si hay clientes esperando entrar
     * @return true si hay clientes en espera
     */
    public boolean hayClienteCola(){
        return colaClientes.size() > 0;
    }
    
    /**
     * En caso de haber, adentra un cliente al Gama
     */
    public void entrarSistema(){
        try {
            if(hayClienteCola()){
                semColaEntrar.acquire();    //La persona agarra el carrito
                Cliente cl = colaClientes.poll();   //Se sale de la cola de espera
                System.out.println(cl.id);
                clientesSistema.add(cl);    //Ahora se encuentra dentro del Gama
                clientesSistemaTxt.setText(""+clientesSistema.size());
            }
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
