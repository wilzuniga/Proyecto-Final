/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Clases.Persona;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wilme
 */
public class Grupo implements Serializable{
    private static final long SerialVersionUID = 777L;
    public ArrayList<Integer> integrantes = new ArrayList();
    public String Nombre;

    public Grupo() {
    }

    public Grupo(String Nombre,ArrayList<Integer> integrantes) {
        this.Nombre = Nombre;
        this.integrantes=integrantes;
    }
    
    

    public ArrayList<Integer> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integer> integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean addIntegrante(Integer e) {
        return integrantes.add(e);
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
