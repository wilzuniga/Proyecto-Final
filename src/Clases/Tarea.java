
package Clases;

import java.util.Date;

public class Tarea {
    public Date FechaVen;
    public String Nota;
    public boolean Relizada;

    public Tarea(Date FechaVen, String Nota, boolean Relizada) {
        this.FechaVen = FechaVen;
        this.Nota = Nota;
        this.Relizada = Relizada;
    }

    public Tarea() {
    }

    public Date getFechaVen() {
        return FechaVen;
    }

    public void setFechaVen(Date FechaVen) {
        this.FechaVen = FechaVen;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public boolean isRelizada() {
        return Relizada;
    }

    public void setRelizada(boolean Relizada) {
        this.Relizada = Relizada;
    }

    @Override
    public String toString() {
        return "Tarea{" + "FechaVen=" + FechaVen + ", Nota=" + Nota + ", Relizada=" + Relizada + '}';
    }
    
    
}
