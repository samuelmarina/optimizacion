package Model;

import Controller.Gama;
import java.util.concurrent.Semaphore;

public class Cajero extends Thread{
    Gama gama;
    public Cliente cl;
    
    public Cajero(Gama gama) {
        this.gama = gama;
    }
    
    @Override
    public void run(){
        gama.pagar(cl, this);
    }
}
