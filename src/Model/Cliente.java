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
    int id;
    Gama gama;
    
    public Cliente(int id, Gama gama){
        this.id = id;
        this.gama = gama;
    }
    @Override
    public void run(){
        try {
            if(gama.semColaEntrar.availablePermits() == 0){
                System.out.println(id + " en cola");
            }
            gama.semColaEntrar.acquire();
            System.out.println(id + " ha entrado al Gama");
            sleep(3000);
            System.out.println(id + " ha salido del Gama");
            gama.semColaEntrar.release();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        gama.nuevoCliente(id);
//            System.out.println("El cliente " + id + " ha entrado al Gama");
//            sleep(5000);
//            System.out.println("El cliente " + id + " ha salido del Gama");
    }
}
