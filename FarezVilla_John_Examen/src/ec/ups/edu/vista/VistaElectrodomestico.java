/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author JHON FAREZ
 */
public class VistaElectrodomestico {
    private Scanner entrada;
    public VistaElectrodomestico(){
    entrada =  new Scanner(System.in);
    }
    public Television ingresarTelevision (){
    entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos de la television");
        System.out.println("Ingrese la resolucion del televisor");
        int resolucion = entrada.nextInt();
        System.out.println("Ingresar el puerto HDI ");
        
               
        
        return new Television(resolucion, true);
    }
    public Lavadora ingresarlavadora(){
        System.out.println("Ingrese los datos de la labadora");
        System.out.println("Ingresar a carga de la lavadora");
        int carga = entrada.nextInt();
      
      return new Lavadora(carga);
    }
   
    public void mostrarLavadoras( List<Lavadora> lavadora){
        for (Lavadora lavadora1 : lavadora) {
            System.out.println("Lista de lavadoras"+lavadora);
        }
    }
    public void mostrarTelevisiones(List<Television> television){
        for (Television television1 : television) {
            System.out.println("Lista de televisiones"+television);   
    }
    }}
