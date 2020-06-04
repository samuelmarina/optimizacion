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
    Gama gama;
    
    public Cliente(int id, Gama gama){
        this.id = id;
        this.gama = gama;
    }
    @Override
    public void run(){
        gama.nuevoCliente(this);
    }
}
