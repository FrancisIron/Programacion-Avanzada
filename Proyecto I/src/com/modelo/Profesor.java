package com.modelo;

public class Profesor {

    private String nombre;
    private String especialidad;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
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

    public void generarReporte_Notas() {
        // TODO - implement Profesor.generarReporte_Notas
        throw new UnsupportedOperationException();
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
