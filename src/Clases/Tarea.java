
package Clases;

import java.util.Date;

public class Tarea {
    public String FechaVen;
    public int IDusuario;
    public String Nota;
    public String Relizada;
    public String Lista;
    public String Titulo;

    public Tarea(String FechaVen, int IDusuario, String Nota, String Relizada, String Lista, String Titulo) {
        this.FechaVen = FechaVen;
        this.IDusuario = IDusuario;
        this.Nota = Nota;
        this.Relizada = Relizada;
        this.Lista = Lista;
        this.Titulo = Titulo;
    }

    public Tarea() {
    }

    public String getFechaVen() {
        return FechaVen;
    }

    public void setFechaVen(String FechaVen) {
        this.FechaVen = FechaVen;
    }

    public int getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(int IDusuario) {
        this.IDusuario = IDusuario;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public String getRelizada() {
        return Relizada;
    }

    public void setRelizada(String Relizada) {
        this.Relizada = Relizada;
    }

    public String getLista() {
        return Lista;
    }

    public void setLista(String Lista) {
        this.Lista = Lista;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Tarea{" + "FechaVen=" + FechaVen + ", IDusuario=" + IDusuario + ", Nota=" + Nota + ", Relizada=" + Relizada + ", Lista=" + Lista + ", Titulo=" + Titulo + '}';
    }

    
    
}
