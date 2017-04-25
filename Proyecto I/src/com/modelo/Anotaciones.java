package com.modelo;

public class Anotaciones {

    private String contenido;
    private String tipo;

    public Anotaciones(String contenido, String tipo) {
        this.contenido=contenido;
        this.tipo=tipo;
    }   
    
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
