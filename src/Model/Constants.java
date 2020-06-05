/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SamuelLMiller
 */
public class Constants {
    //Hora
    public int hora;
    
    //Estantes
    public int estantesIniciales;
    public int maxEstantes;
    public int capacidadMaxEstantes;
    
    //Cajas
    public int cajasIniciales;
    public int maxCajas;
    
    //Carritos
    public int carritosIniciales;
    public int maxCarritos;
    
    //Retardos
    public int retardoEstante;
    public int retardoCaja;
    public int retardoGanancias;
    public int retardoDevCarrito;
    public int retardoEmpleado;
    
    //Singleton
    private static final Constants shared = new Constants();
    
    private Constants(){
        
    }
    
    public static Constants shared(){
        return shared;
    }

    public void prepare(int hora, int estantesIniciales, int maxEstantes, int capacidadMaxEstantes, 
            int cajasIniciales, int maxCajas, int carritosIniciales, int maxCarritos) {
        this.hora = hora;
        this.estantesIniciales = estantesIniciales;
        this.maxEstantes = maxEstantes;
        this.capacidadMaxEstantes = capacidadMaxEstantes;
        this.cajasIniciales = cajasIniciales;
        this.maxCajas = maxCajas;
        this.carritosIniciales = carritosIniciales;
        this.maxCarritos = maxCarritos;
        
        this.retardoEstante = (int)(0.1 * hora * 1000);
        this.retardoCaja = (int) (0.0168 * hora * 1000);
        this.retardoGanancias = (int) (0.0083 * hora * 1000);
        this.retardoDevCarrito = (int)(0.033 * hora * 1000);
        this.retardoEmpleado = (int)(0.083 * hora * 1000);
    }
}
