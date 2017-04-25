package com.modelo;

import java.util.ArrayList;

public class Alumno {
    
    private String nombre;
    private String curso;
    private Apoderado apoderado;
    private ArrayList<Boolean> asistenciaClases;
    private ArrayList<Nota> calificaciones;
    private ArrayList<Anotaciones> anotaciones;
    
    public Alumno(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;        
        this.anotaciones = new ArrayList();
        this.asistenciaClases = new ArrayList();
        this.calificaciones = new ArrayList();
    }
    
    public ArrayList<Boolean> getAsistenciaClases() {
        return asistenciaClases;
    }
    
    public void setAsistenciaClases(ArrayList<Boolean> asistenciaClases) {
        this.asistenciaClases = asistenciaClases;
    }
    
    public ArrayList<Nota> getCalificaciones() {
        return calificaciones;
    }
    
    public void setCalificaciones(ArrayList<Nota> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    public ArrayList<Anotaciones> getAnotaciones() {
        return anotaciones;
    }
    
    public void setAnotaciones(ArrayList<Anotaciones> anotaciones) {
        this.anotaciones = anotaciones;
    }
    
    public Apoderado getApoderado() {
        return apoderado;
    }
    
    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }
    
    public void ingresarAnotacion(String contenido, String tipo) {
        anotaciones.add(new Anotaciones(contenido, tipo));
    }
    
    public void modificarAnotaciones(int i, String contenido, String tipo) {
        anotaciones.get(i).setContenido(contenido);
        anotaciones.get(i).setTipo(tipo);
    }

    /**
     * [PosicionAsignatura][PosicionNota] 
     * [1][] - Lenguaje 
     * [2][] - Matematicas
     * [3][] - Ciencias Naturales 
     * [4][] - Ciencias Sociales 
     * [5][] - Educación Fisica
     */
    public void ingresarNota(double nota, String asignatura, String contenido) {
        calificaciones.add(new Nota(nota, asignatura,contenido));
    } 
    
    
    public void modificarNota (int i, double nota, String contenido) {
       calificaciones.get(i).setNota(nota);
       calificaciones.get(i).setContenido(contenido);
    }    
    
    public void ingresarAsistencia(Boolean state) {
        asistenciaClases.add(state);
    }
    
    public void obtenerPCT_Asistencia() {
        // TODO - implement Alumno.obtenerPCT_Asistencia
        throw new UnsupportedOperationException();
    }
    
    public void modificarAsistencia(int i, Boolean state ) {
        asistenciaClases.set(i, state);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
