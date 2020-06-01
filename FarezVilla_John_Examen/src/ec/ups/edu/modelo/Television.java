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
public class Television {
    private int resolucion;
    private  boolean puertoHDMI;
    
    public Television (){
    
    }
    

    public Television(int resolucion, boolean puertoHDMI) {
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }

  
    
    
    
            
    
}
