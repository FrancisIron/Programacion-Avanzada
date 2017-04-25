package com.modelo;

public class Nota {
    private double nota;
    private String asignatura;
    private String contenido;

    public Nota(double nota, String asignatura, String contenido) {
        this.nota = nota;
        this.asignatura = asignatura;
        this.contenido = contenido;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}