package Model;

import Controller.Gama;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jefe extends Thread{
    Gama gama;

    public Jefe(Gama gama) {
        this.gama = gama;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                sleep(Constants.shared().retardoJefe);
                gama.contarHoras(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
