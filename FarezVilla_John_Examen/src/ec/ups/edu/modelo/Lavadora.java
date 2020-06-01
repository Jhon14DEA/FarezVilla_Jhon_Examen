/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.*;

/**
 *
 * @author JHON FAREZ
 */
public class Lavadora {

    private int carga;

    public Lavadora() {

    } 
    

    public Lavadora(int carga) {
        
    }

   
     public void obtenerPrecioFinal(double precioBase,int carga ){
        if (carga > 30 ) {
            precioBase +=50;
        } 
    }
    

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

}
