/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.dao;

import ec.ups.edu.idao.IElectrodomesticoDAO;
import ec.ups.edu.modelo.Lavadora;
import ec.ups.edu.modelo.Television;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JHON FAREZ
 */
public class ElectronomesticoDAO implements IElectrodomesticoDAO {
    
    private List<Lavadora>listaLavadora;
    private List<Television>listaTelevision;
    public ElectronomesticoDAO (){
    listaLavadora = new ArrayList<>();
    }

    public void create(Lavadora lavadora){
     listaLavadora.add(lavadora);
        
    }
    public  void create (Television television){
    listaTelevision.add(television);
    }
    public List<Lavadora> finAll(){
    return listaLavadora;
    }    /*
    public List<Television> finAll(){
    return listaTelevision;
    }      */ 
}
