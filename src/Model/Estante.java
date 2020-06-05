
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
    public void run() {
        if (productos <= 0) {
            try {
                sleep(Constants.shared().retardoEmpleado);
                this.productos = 3;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        while (hayClienteCola()) {
            gama.pasarEstante(colaEstante.poll(), this);
        }

    }
    
    /**
     * Verifica si hay cliente en cola para pasar al estante
     * @return true si hay cola
     */
    public boolean hayClienteCola(){
        return colaEstante.size() > 0;
    }
}
