package com.pgy2121.democolecciones;

import com.pgy2121.democolecciones.DTO.CampeonatoInterPais;
import com.pgy2121.democolecciones.DTO.Equipo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Equipo mancity = new Equipo();
        mancity.setNombre("Manchester City");
        mancity.setColorCamiseta("Celeste");
        mancity.setEstadio("Etyhad Stadium");
        mancity.setPais("Inglaterra");
        mancity.setCantidadJugadores(23);
        
        Equipo manunited = new Equipo();
        manunited.setNombre("Manchester United");
        manunited.setColorCamiseta("Rojo");
        manunited.setEstadio("Old Trafford");
        manunited.setPais("Inglaterra");
        manunited.setCantidadJugadores(23);
        
        Equipo psg = new Equipo();
        psg.setNombre("Paris Saint Germain");
        psg.setColorCamiseta("Azul");
        psg.setEstadio("Parque de los Príncipes");
        psg.setPais("Le France");
        psg.setCantidadJugadores(23);
        
        Equipo barza = new Equipo();
        barza.setNombre("Barcelona FC");
        barza.setColorCamiseta("Azul con Rojo");
        barza.setEstadio("Nou Camp Nou");
        barza.setPais("España");
        barza.setCantidadJugadores(23);
        
        Equipo villa = new Equipo();
        villa.setNombre("Villareal FC");
        villa.setColorCamiseta("Amarillo");
        villa.setEstadio("Estadio de la Cerámica");
        villa.setPais("España");
        villa.setCantidadJugadores(23);
        
        CampeonatoInterPais liga = new CampeonatoInterPais();
        liga.setNombre("Campeonato Dr Simi");
        liga.setPremio(1500);
        
        liga.AgregarEquipo(villa);
        liga.AgregarEquipo(psg);
        liga.AgregarEquipo(barza);
        
        liga.QuitarEquipo(barza);
        
        System.out.println("Hay "+ liga.getCantidadEquipos() + " Equipos inscritos:");
        System.out.println(liga.DetalleEquipos());
    }
}
