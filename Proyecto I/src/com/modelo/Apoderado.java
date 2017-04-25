package com.modelo;

import java.util.ArrayList;

public class Apoderado {

    private String nombre;
    private ArrayList<Alumno> pupilos;

    public Apoderado(String nombre) {
        this.nombre = nombre;
        this.pupilos = new ArrayList();
    }

    public ArrayList<Alumno> getPupilos() {
        return pupilos;
    }

    public void setPupilos(ArrayList<Alumno> pupilos) {
        this.pupilos = pupilos;
    }

    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarInforme() {
        // TODO - implement Apoderado.solicitarInforme
        throw new UnsupportedOperationException();
    }
    
    public void anadirPupilo(Alumno pupilo){
        pupilos.add(pupilo);
    }
}
