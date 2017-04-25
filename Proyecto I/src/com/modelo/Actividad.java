package com.modelo;

public class Actividad {

	private String nombre;
	private String contenido;
	private String fecha;

    public Actividad(String nombre, String contenido, String fecha) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.fecha = fecha;
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

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}