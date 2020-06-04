
package Model;

import Controller.Gama;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estante extends Thread{
    public int productos;
    public int id;
    public Semaphore semaforo;
    Queue<Cliente> colaEstante;
    Gama gama;

    public Estante(Gama gama, int id) {
        this.productos = 3;
        this.semaforo = new Semaphore(1);
        this.gama = gama;
        colaEstante = new LinkedList<>();
        this.id = id;
    }
    
    @Override
    public void run(){
        //cliente.sleep
        if(productos <= 0){
            try {
                sleep(5000);
                this.productos = 3;
            } catch (InterruptedException ex) {
                Logger.getLogger(Estante.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while(hayClienteCola()){
           gama.pasarEstante(colaEstante.poll(), this);
        }
        
        
    }
    
    public boolean hayClienteCola(){
        return colaEstante.size() > 0;
    }
}
