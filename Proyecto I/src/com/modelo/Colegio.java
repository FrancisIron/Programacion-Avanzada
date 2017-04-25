package com.modelo;

import java.util.ArrayList;


public class Colegio {

    private String nombre;
    private ArrayList<Curso> cursos;    

    public Colegio() {        
        this.cursos = new ArrayList();        
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }    
        
    public void anadirCurso(String gradoCurso) {
        cursos.add(new Curso(gradoCurso));
    }

    public void generarInforme() {
        // TODO - implement Colegio.generarInforme
        throw new UnsupportedOperationException();
    }    

    public void generarInforme_Planificacion() {
        // TODO - implement Colegio.generarInforme_Planificacion
        throw new UnsupportedOperationException();
    }

}
