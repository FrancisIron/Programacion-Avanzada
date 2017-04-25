package com.modelo;

public class Asignatura {

	private String nombre;
	private Planificacion planificacion;
	private Profesor profesorCargo;

    public Asignatura(String nombre, Profesor profesorCargo, Planificacion planificacion) {
        this.nombre = nombre;
        this.profesorCargo = profesorCargo;
        this.planificacion = planificacion;
    }

	public void ingresarActividad(String nombre, String contenido, String fecha) {
                planificacion.anadirActividad(nombre, contenido, fecha);
	}

	public void modificarPanificacion(int i, String novoContenido_Planificacion, String nombre, String novoContenido_Actividad, String fecha ) {
		planificacion.setContenido(novoContenido_Planificacion);
                planificacion.modificarActividad(i, nombre, novoContenido_Actividad, fecha);
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

	public void modificarProfesor_Cargo(String nom) {
		profesorCargo.setNombre(nom);
                profesorCargo.setEspecialidad(nombre);
	}

}