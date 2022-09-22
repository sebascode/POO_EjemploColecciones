package com.pgy2121.democolecciones.DTO;

import java.util.ArrayList;
import java.util.List;

public class CampeonatoInterPais {
    private String Nombre;
    private int Premio; //--> ($$);
    private List<Equipo> Equipos;

    public CampeonatoInterPais(){
        this.Equipos = new ArrayList<>();
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPremio() {
        return Premio;
    }

    public void setPremio(int Premio) {
        this.Premio = Premio;
    }

    public List<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(List<Equipo> Equipos) {
        this.Equipos = Equipos;
    }
    
    public int getCantidadEquipos(){
        return this.Equipos.size();
    }
    
    public void AgregarEquipo(Equipo equipoNuevo){
        this.Equipos.add(equipoNuevo);
    }
    
    public void QuitarEquipo(Equipo equipoEliminado){
        this.Equipos.remove(equipoEliminado);
    }
    
    public String DetalleEquipos(){
        String resultado = "";
        for(Equipo equipo : this.Equipos){
            resultado += "\n"+equipo.toString();
        }
        return resultado;
    }
}
