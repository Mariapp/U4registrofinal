package com.example.didact.u4registrofinal;

/**
 * Created by DIDACT on 16/02/2018.
 */

public class item_reservas {

    String nombre;
    String dia;
    String hora;
    int personas;
    String observaciones;


    public item_reservas(String nombre, String dia, String hora, int personas) {
        this.nombre = nombre;
        this.dia = dia;
        this.hora = hora;
        this.personas = personas;
        this.observaciones = observaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
