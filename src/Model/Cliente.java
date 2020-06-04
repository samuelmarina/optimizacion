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
                est.start();
            }
            this.suspend(); //Pausamos el hilo hasta que termine de recorrer el estante
        }
    }
}
