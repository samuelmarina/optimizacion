/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Constants;
import Model.Estante;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
//    int estantes;
    public List<Estante> estantes;
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
    
    public Gama(JTextField estantesTxt, JTextField carritosTxt, JTextField cajasTxt,
            JTextField clientesColaTxt, JTextField clientesSistemaTxt, JTextField horasLaboralesTxt, JTextField gananciasTxt, Constants k){
        this.k = k;
        this.carritos = k.carritosIniciales;
        this.cajas = k.cajasIniciales;
        
        estantes = new ArrayList<>();
        for(int i = 0; i < k.estantesIniciales; i++){
            estantes.add(new Estante(this, i));
        }

        
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
        clientesColaTxt.setText(""+colaClientes.size());
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
    public void entrarSistema(Cliente cliente){
        try {
            boolean flag = false;
            //En cola si no hay carritos
            if(semColaEntrar.availablePermits() == 0){
                int totalClientes = Integer.parseInt(clientesColaTxt.getText()) + 1;
                clientesColaTxt.setText(""+totalClientes);
                flag = true;
                System.out.println("El cliente " + cliente.id + " esta en cola");
            }
            
            //La persona agarra el carrito
            semColaEntrar.acquire();
            System.out.println("El cliente " + cliente.id + " entro al Gama");
            //Si estaba en cola, actualizo el txt
            if(flag){
                int totalClientes = Integer.parseInt(clientesColaTxt.getText()) - 1;
                clientesColaTxt.setText(""+totalClientes);
            }
            
            clientesSistema.add(cliente);    //Ahora se encuentra dentro del Gama
            
            //Actualizo el txt de clientes en sistema
            clientesSistemaTxt.setText("" + clientesSistema.size());
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void pasarEstante(Cliente cl, Estante est){
        if(cl == null) return;
        
        try {
            est.semaforo.acquire();
            System.out.println("El cliente " + cl.id + " esta en el estante " + est.id);
            est.sleep(6000);    //Modificar basandonos en la hora
            
            System.out.println("Hay " + est.productos + " productos en el estante " + est.id);
            //Todos los productos que va a agarrar
            int totalProductos = randomNum(est.productos);
            
            System.out.println("El cliente " + cl.id + " agarro " + totalProductos + " productos");
            est.productos -= totalProductos;
            
            System.out.println("Ahora quedan " + est.productos + " productos");
            
            for(int i = 0; i < totalProductos; i++){
                //Asignar precio
                cl.cesta += randomNum(10) + 1;
                
            }
            System.out.println("El cliente " + cl.id + " salio del estante " + est.id);
            est.semaforo.release();
            cl.resume();
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public int randomNum(int max) {
        return (int) (Math.random() * max);
    }
}
