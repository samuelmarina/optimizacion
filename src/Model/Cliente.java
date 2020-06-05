/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Gama;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SamuelLMiller
 */
public class Cliente extends Thread{
    public int id;
    public int cesta;
    public int cantProductos;
    Gama gama;
    
    public Cliente(int id, Gama gama){
        this.id = id;
        this.gama = gama;
        this.cesta = 0;
    }
    @Override
    public void run(){
        //Entramos al sistema pasando por la cola
        gama.entrarSistema(this);
        
        //Pasamos por todos los estantes
        for(Estante est : gama.estantes){
            est.colaEstante.add(this);
            if(!est.isAlive()){
                (new Thread(est)).start();         
            }
            this.suspend(); //Pausamos el hilo hasta que termine de recorrer el estante
        }
        
        try {
            gama.semCajasR.acquire();
            System.out.println("El cliente " + id + " va a pagar");
            Cajero caja = gama.colaCajas.poll();
            caja.cl = this;
            if(!caja.isAlive()){
                (new Thread(caja)).start();
            }
            this.suspend();
            gama.salirCliente(this);
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        
    }
}
