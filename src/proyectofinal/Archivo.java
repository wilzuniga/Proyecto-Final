/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;

/**
 *
 * @author wilme
 */
public class Archivo implements Serializable {
    private static final long SerialVersionUID = 777L;
    public String Fecha;
    public File Arch;
    public ArrayList<Integer> Ides = new ArrayList();
    public String Papelera = "No";

    public Archivo(String Fecha, File Arch, int Ide) {
        this.Fecha = Fecha;
        this.Arch = Arch;
        this.Ides.add(Ide);
    }

    public Archivo() {
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public File getArch() {
        return Arch;
    }

    public void setArch(File Arch) {
        this.Arch = Arch;
    }

    public ArrayList<Integer> getIdes() {
        return Ides;
    }

    public void setIdes(ArrayList<Integer> Ides) {
        this.Ides = Ides;
    }

    public void AddIdes(int Ide) {
        this.Ides.add(Ide);
    }

    public String getPapelera() {
        return Papelera;
    }

    public void setPapelera(String Papelera) {
        this.Papelera = Papelera;
    }

    @Override
    public String toString() {
        return "Archivo{" + "Fecha=" + Fecha + ", Arch=" + Arch + ", Ides=" + Ides + '}';
    }

}
