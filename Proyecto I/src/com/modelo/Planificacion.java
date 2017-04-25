package com.modelo;

import java.util.ArrayList;

public class Planificacion {

    private ArrayList<Actividad> listaActividades;
    private String contenido;

    public Planificacion(String contenido) {
        this.contenido = contenido;
        this.listaActividades = new ArrayList();
    }

    public ArrayList<Actividad> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<Actividad> listaActividades) {
        this.listaActividades = listaActividades;
    }

    public void anadirActividad(String nombre, String contenido, String fecha) {
        listaActividades.add(new Actividad(nombre, contenido, fecha));
    }

    public void modificarActividad(int i, String nombre, String contenido, String fecha) {
        listaActividades.get(i).setNombre(nombre);
        listaActividades.get(i).setContenido(contenido);
        listaActividades.get(i).setFecha(fecha);
    }

    public void eliminarActividad(int i) {
        listaActividades.remove(i);
    }

    public String getContenido() {
        return this.contenido;
    }

    /**
     *
     * @param contenido
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

}
