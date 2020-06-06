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
        int currNumEstantes = gama.estantes.size();
        for (int i = 0; i < currNumEstantes; i++) {
            Estante current = gama.estantes.get(i);
            current.colaEstante.add(this);
            if(!current.isAlive()){
                (new Thread(current)).start();
            }
            this.suspend();
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
