/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cajero;
import Model.Cliente;
import Model.Constants;
import Model.Estante;
import Model.Jefe;
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
    public Queue<Cajero> colaCajas = new LinkedList<>();
    public Semaphore semCajasR; 
    
    //Estantes
    public List<Estante> estantes;
    
    public int ganancias;
    public int carritos;
    public int cajas;
    public double horasLaborales;
    
    //TextFields
    public JTextField estantesTxt;
    public JTextField carritosTxt;
    public JTextField cajasTxt;
    public JTextField clientesColaTxt;
    public JTextField clientesSistemaTxt;
    public JTextField horasLaboralesTxt;
    public JTextField gananciasTxt;
    
    //Constantes
    public Constants k;
    
    //Flags
    public boolean flagCarrito = false;
    public boolean flagCaja = false;
    
    public Gama(JTextField estantesTxt, JTextField carritosTxt, JTextField cajasTxt,
            JTextField clientesColaTxt, JTextField clientesSistemaTxt, JTextField horasLaboralesTxt, JTextField gananciasTxt, Constants k){
        this.k = k;
        this.carritos = k.carritosIniciales;
        
        this.cajas = k.cajasIniciales;
        for(int i = 0; i < cajas; i++){
            colaCajas.add(new Cajero(this));
        }
        
        estantes = new ArrayList<>();
        for(int i = 0; i < k.estantesIniciales; i++){
            estantes.add(new Estante(this, i));
        }

        
        this.semColaEntrar = new Semaphore(k.carritosIniciales);
        this.semCajasR = new Semaphore(k.cajasIniciales);
        
        this.estantesTxt = estantesTxt;
        this.carritosTxt = carritosTxt;
        this.cajasTxt = cajasTxt;
        this.clientesColaTxt = clientesColaTxt;
        this.clientesSistemaTxt = clientesSistemaTxt;
        this.horasLaboralesTxt = horasLaboralesTxt;
        this.gananciasTxt = gananciasTxt;
    }
    
    /**
     * Comprueba si hay clientes esperando entrar
     * @return true si hay clientes en espera
     */
    public boolean hayClienteCola(){
        return colaClientes.size() > 0;
    }
    
    /**
     * Maneja la llegada de un cliente al sistema
     * @param cliente
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
    
    /**
     * Maneja el transcurso del cliente al llegar a un estante
     * @param cl : cliente
     * @param est : estante actual
     */
    public void pasarEstante(Cliente cl, Estante est){
        if(cl == null) return;
        
        try {
            est.semaforo.acquire();
            System.out.println("El cliente " + cl.id + " esta en el estante " + est.id);
            int retardoEstante = k.retardoEstante;
            est.sleep(retardoEstante);    
            
            System.out.println("Hay " + est.productos + " productos en el estante " + est.id);
            //Todos los productos que va a agarrar
            int totalProductos = randomNum(est.productos);
            cl.cantProductos = totalProductos;
            
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
    
    /**
     * Maneja el transcurso del cliente en la caja registradora
     * @param cl : cliente
     * @param ca : cajero
     */
    public void pagar(Cliente cl, Cajero ca){
        if(cl == null) return;
        int retardoCaja = (int) (cl.cantProductos * k.retardoCaja);
        try {
            ca.sleep(retardoCaja);
            System.out.println("El cliente " + cl.id + " pago un total de $" + cl.cesta);
            this.ganancias += cl.cesta;
            System.out.println("El mercado ha hecho $" + ganancias);
//            gananciasTxt.setText(Integer.toString(ganancias));
            cl.resume();
//            semCajasR.release();
            ca.sleep(k.retardoGanancias);
            this.gananciasTxt.setText(""+ganancias);
            ca.cl = null;
            if(!flagCaja){
                colaCajas.add(ca);
                semCajasR.release();
            }
            else{
                flagCaja = false;
            }
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Maneja la salida del cliente del sistema
     * @param cl : cliente
     */
    public void salirCliente(Cliente cl){
        try {
            System.out.println("El cliente " + cl.id + " entrega el carrito");
            cl.sleep(k.retardoDevCarrito);
            System.out.println("El cliente " + cl.id + " salio del Gama");
            if(!flagCarrito){
                semColaEntrar.release();
            }else{
                flagCarrito = false;
            }
            clientesSistema.remove(cl);
            clientesSistemaTxt.setText(""+clientesSistema.size());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }
    
    /**
     * Actualiza el contador de horas laborales
     * @param jefe : hilo que corre en bucle
     */
    public void contarHoras(Jefe jefe){
        if(horasLaborales >= 8.0){
            this.horasLaborales = 0;
            this.ganancias = 0;
        }else{
           this.horasLaborales += 0.02; 
        }
        this.horasLaboralesTxt.setText(""+horasLaborales);
    }
    
    /**
     * Genera un numero aleatorio
     * @param max : limite superior del numero
     * @return entero aleatorio
     */
    public int randomNum(int max) {
        if(max == 1){
            return (int) (Math.random() * 2);
        }
        return (int) (Math.random() * max);
    }
    
    /**
     * Agrega un permiso al semaforo para entrar al sistema
     * @return true si no se ha alcanzado la cantidad max 
     * de carritos
     */
    public boolean agregarCarrito(){
        if(carritos < k.maxCarritos){
            semColaEntrar.release();
            carritos+=1;
            this.carritosTxt.setText(""+carritos);
            System.out.println("Ahora quedan "+ carritos + " en el supermercado");
            return true;
        }
        return false;
    }
    
    /**
     * Elimina un permiso del semaforo para entrar al sistema
     * @return true si la cantidad de carritos disponibles es
     * superior a la cantidad de carritos iniciales
     */
    public boolean eliminarCarrito(){
        if(carritos > k.carritosIniciales){
            try {
                if(semColaEntrar.getQueueLength() == 0){
                    semColaEntrar.acquire();
                    colaCajas.poll();
                }
                else{
//                    System.out.println("AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa");
                    flagCarrito = true;
                }
                carritos-=1;
                this.carritosTxt.setText(""+carritos);
                System.out.println("Ahora quedan "+ carritos + " en el supermercado");
                return true;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }       
        }
        return false;
    }
    
    /**
     * Agrega un objeto de tipo Cajero a la cola y agrega
     * un nuevo permiso al semaforo de cajeros
     * @return true si no se ha alcanzado el numero maximo
     * de cajas por agregar
     */
    public boolean agregarCaja(){
        if(cajas < k.maxCajas){
            colaCajas.add(new Cajero(this));
            semCajasR.release();
            cajas += 1;
            cajasTxt.setText(Integer.toString(cajas));
            return true;
        }
        return false;
    }
    
    
    /**
     * Elimina un permiso del semaforo de los cajeros
     * @return true si no se ha alcanzado el numero minimo
     * de cajas por eliminar
     */
    public boolean eliminarCaja() {
        if (cajas > k.cajasIniciales) {
            try{
                if(semCajasR.getQueueLength() == 0){
                    semCajasR.acquire();
                    
                }
                else{
                    this.flagCaja = true;
                }
                cajas -= 1;
                cajasTxt.setText(Integer.toString(cajas));
                return true;
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        return false;
    }
    
    /**
     * Agrega un nuevo objeto de tipo estante a la lista
     * @return true si no se ha alcanzado la cant max de 
     * estantes 
     */
    public boolean agregarEstante(){
        if(estantes.size() < k.maxEstantes){
            estantes.add(new Estante(this, estantes.size()));
            this.estantesTxt.setText(""+estantes.size());
            return true;
        }
        return false;
    }
}
