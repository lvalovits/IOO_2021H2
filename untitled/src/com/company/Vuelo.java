package com.company;

import java.util.List;

public class Vuelo {

    private String idVuelo;
    private int duracionEnMinutos;

    //Relaciones 1 a 1
    private Aeropuerto origen;
    private Aeropuerto destino;
    private Avion avion;
    private Tripulacion tripulacion;

    //Relaciones 1 a *
    private List<Pasajero> pasajeros;
    private List<Vuelo> vuelos;



    public Vuelo(){
        this.tripulacion = new Tripulacion();
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
