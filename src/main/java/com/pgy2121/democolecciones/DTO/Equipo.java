package com.pgy2121.democolecciones.DTO;

public class Equipo {
    private String Nombre;
    private String ColorCamiseta;
    private int CantidadJugadores;
    private String Estadio;
    private String Pais;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getColorCamiseta() {
        return ColorCamiseta;
    }

    public void setColorCamiseta(String ColorCamiseta) {
        this.ColorCamiseta = ColorCamiseta;
    }

    public int getCantidadJugadores() {
        return CantidadJugadores;
    }

    public void setCantidadJugadores(int CantidadJugadores) {
        this.CantidadJugadores = CantidadJugadores;
    }

    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    @Override
    public String toString(){
        return this.Nombre + " (" + this.Pais + ") "+ this.ColorCamiseta; 
    }
}
