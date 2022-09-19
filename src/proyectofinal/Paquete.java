/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.Serializable;
import java.util.ArrayList;

public class Paquete implements Serializable {
    private static final long SerialVersionUID = 777L;
    private ArrayList<Grupo> GruposI = new ArrayList();
    private ArrayList<Archivo> ArchivosI = new ArrayList();

    public Paquete() {
    }

    public ArrayList<Grupo> getGruposI() {
        return GruposI;
    }

    public void setGruposI(ArrayList<Grupo> GruposI) {
        this.GruposI = GruposI;
    }

    public ArrayList<Archivo> getArchivosI() {
        return ArchivosI;
    }

    public void setArchivosI(ArrayList<Archivo> ArchivosI) {
        this.ArchivosI = ArchivosI;
    }

    
    
}
