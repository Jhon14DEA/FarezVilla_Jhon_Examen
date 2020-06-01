/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.List;

/**
 *
 * @author JHON FAREZ
 */
public class Electrodomestico {
    private int codigo;
    private String descripcion;
    private double precioBase;
    private char consumoEenergetico;
    private int peso;
    //atributos de relacion 
    private List <Lavadora> lavadoras;
    private List <Television> televisiones;

    
    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico(int codigo, String descripcion, double precioBase, char consumoEenergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.consumoEenergetico = consumoEenergetico;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public char getConsumoEenergetico() {
        return consumoEenergetico;
    }

    public void setConsumoEenergetico(char consumoEenergetico) {
        this.consumoEenergetico = consumoEenergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void obtenerPrecioFinalLavadora(double precioBase,int carga ){
        if (carga > 30 ) {
            precioBase +=50;
        } 
    }
   
    public double obtenerPrecioFinalTelevision(int resolucion, double precioBase){
        int aux = (int) precioBase;
        if (resolucion > 40) {
            aux *=0.3;
            precioBase += aux;
        } return precioBase;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", consumoEenergetico=" + consumoEenergetico + ", peso=" + peso + '}';
    }
    
    
    
    
    
    
    
}
