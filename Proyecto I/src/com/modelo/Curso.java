package com.modelo;

import java.util.ArrayList;

public class Curso {

    private ArrayList<Alumno> listaAlumnos;
    private ArrayList<Asignatura> listaAsignaturas;
    private String curso;

    public Curso(String curso) {
        this.curso = curso;
        this.listaAlumnos = new ArrayList();
        this.listaAsignaturas = new ArrayList();
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public String getCurso() {
        return this.curso;
    }

    /**
     *
     * @param curso
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     *
     * @param nom
     * @param cur
     */
    public void anadirAlumno(String nom, String cur) {
        listaAlumnos.add(new Alumno(nom, cur));
    }

    /**
     *
     * @param i
     * @param novoNom
     * @param novoCur
     */
    public void modificarAlumno(int i, String novoNom, String novoCur) {
        listaAlumnos.get(i).setNombre(novoNom);
        listaAlumnos.get(i).setCurso(novoCur);
    }

    public void verLista() {
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i).toString());
        }
    }
    
    public Alumno getAlumno (int i){
        return listaAlumnos.get(i);
    }
    
    public Asignatura getAsignatura (int i){
        return listaAsignaturas.get(i);
    }

    public void eliminarAlumno(int i) {
        listaAlumnos.remove(i);
    }

    public void anadirAsignatura(String nomAsign, String nomProf, String contenidoPlan) {
        listaAsignaturas.add(new Asignatura(nomAsign, new Profesor(nomProf, nomAsign), new Planificacion(contenidoPlan)));
    }

    public void modificarAsignatura(int i, String nombreAsignatura, String nomProf, int o, String contain_Planificacion, String nombreActividad, String contain_Actividad, String fecha) {
        listaAsignaturas.get(i).setNombre(nombreAsignatura);
        listaAsignaturas.get(i).modificarProfesor_Cargo(nomProf);
        listaAsignaturas.get(i).modificarPanificacion(o, contain_Planificacion, nombreActividad, contain_Actividad, fecha);
    }

    public void verAsignatura() {
        // TODO - implement Curso.verAsignatura
        throw new UnsupportedOperationException();
    }

    public void eliminarAsignatura(int i) {
        listaAsignaturas.remove(i);
    }

}
