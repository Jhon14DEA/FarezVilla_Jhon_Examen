/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controlador;

import ec.ups.edu.idao.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Electrodomestico;
import ec.ups.edu.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author JHON FAREZ
 */
public class ControladorElectrodomestico {
   //objetos vista
    private VistaElectrodomestico vistaElectrodomestico;
   //objetos de modelo
    private Electrodomestico electrodomestico;
    //objetos de DAO
    private IElectrodomesticoDAO electrodomesticoDAO;

    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, Electrodomestico electrodomestico, IElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomestico = electrodomestico;
        this.electrodomesticoDAO = electrodomesticoDAO;
    }
    
    public void registrarLavadora(){
    
    }
    public void registrarTelevicion(){
    
    }
    public void verLavadoras(){
    
    }
    public void verTelevisiones(){
    
    }
}
