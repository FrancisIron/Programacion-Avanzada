package Main;

import com.datos.CargarDatos;
import com.datos.GuardarDatos;
import com.modelo.Alumno;
import com.modelo.Apoderado;
import com.modelo.Colegio;
import com.modelo.Curso;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.xml.transform.TransformerException;

public class GenerarPoblacion_Inicial {

    public static void main(String[] args) throws IOException, TransformerException {
        Colegio colegioPrueba = new Colegio();
        colegioPrueba.setNombre("Santa Mau");
        ArrayList<Apoderado> listaApoderados = new ArrayList();
        listaApoderados = generarApoderado();
        for (int i = 1; i < 9; i++) {
            colegioPrueba.anadirCurso(i + "A");
            colegioPrueba.anadirCurso(i + "B");
        }
        for (int i = 0; i < 16; i++) {
            for (int n = 0; n < 30; n++) {
                colegioPrueba.getCursos().get(i).anadirAlumno(generarNombre(), colegioPrueba.getCursos().get(i).getCurso());
                colegioPrueba.getCursos().get(i).getAlumno(n).setApoderado(new Apoderado(asignarApoderado(listaApoderados)));
                for (int m = 0; m < listaApoderados.size(); m++) {
                    if (listaApoderados.get(m).getNombre().equals(colegioPrueba.getCursos().get(i).getAlumno(n).getApoderado().getNombre())) {
                        System.out.println("Añadiendo estudiante");
                        colegioPrueba.getCursos().get(i).getAlumno(n).getApoderado().anadirPupilo(colegioPrueba.getCursos().get(i).getAlumno(n));
                        System.out.println(listaApoderados.get(m).getNombre() + " - " + colegioPrueba.getCursos().get(i).getAlumno(n).getNombre());
                    }
                }
                for (int k = 0; k < 25; k++) {
                    double number = (Math.random() * 7);
                    BigDecimal bd = new BigDecimal(number);
                    bd = bd.setScale(1, RoundingMode.HALF_UP);
                    if (k < 5) {
                        colegioPrueba.getCursos().get(i).getAlumno(n).ingresarNota(Double.parseDouble("" + bd), "Lenguaje", "Nota prueba");
                    } else {
                        if (k >= 5 && k < 10) {
                            colegioPrueba.getCursos().get(i).getAlumno(n).ingresarNota(Double.parseDouble("" + bd), "Matematicas", "Nota prueba");
                        } else {
                            if (k >= 10 && k < 15) {
                                colegioPrueba.getCursos().get(i).getAlumno(n).ingresarNota(Double.parseDouble("" + bd), "Ciencias Naturales", "Nota prueba");
                            } else {
                                if (k >= 15 && k < 20) {
                                    colegioPrueba.getCursos().get(i).getAlumno(n).ingresarNota(Double.parseDouble("" + bd), "Ciencias Sociales", "Nota prueba");
                                } else {
                                    if (k >= 20 && k < 25) {
                                        colegioPrueba.getCursos().get(i).getAlumno(n).ingresarNota(Double.parseDouble("" + bd), "Educacion Fisica", "Nota prueba");
                                    }
                                }
                            }
                        }
                    }
                }
                for (int m = 0; m < 30; m++) {
                    Boolean state;
                    int random = (int) (Math.random() * 2);
                    if (random == 1) {
                        state = true;
                    } else {
                        state = false;
                    }
                    colegioPrueba.getCursos().get(i).getAlumno(n).ingresarAsistencia(state);
                }
            }           
            colegioPrueba.getCursos().get(i).anadirAsignatura("Lenguaje", generarNombre(), "");
            colegioPrueba.getCursos().get(i).anadirAsignatura("Matematicas", generarNombre(), "");
            colegioPrueba.getCursos().get(i).anadirAsignatura("Ciencias Naturales", generarNombre(), "");
            colegioPrueba.getCursos().get(i).anadirAsignatura("Ciencias Sociales", generarNombre(), "");
            colegioPrueba.getCursos().get(i).anadirAsignatura("Educacion Fisica", generarNombre(), "");        
            for (int k = 0; k < 5; k++) {
                for (int n = 0; n <10 ; n++) {
                    colegioPrueba.getCursos().get(i).getAsignatura(k).ingresarActividad("Actividad" + " " + (n + 1), "", "DD-MM-AAAA");
                }
            }
        }
        for (Curso c : colegioPrueba.getCursos()) {
            for (Alumno e : c.getListaAlumnos()) {

            }
        }
        GuardarDatos secretario = new GuardarDatos();
        secretario.parserXML(colegioPrueba);
        secretario.parserXMLtoJSON(colegioPrueba);
        CargarDatos cargar = new CargarDatos();
        Colegio colegioCarga = new Colegio();
        colegioCarga = cargar.cargarXML();
        for (int i = 0; i < 16; i++) {
            for (int n = 0; n < 30; n++) {
                System.out.println(colegioCarga.getCursos().get(i).getAlumno(n).getNombre());
            }
        }
    }

    

    

    public static String generarNombre() {
        String[] nombres = new String[]{"Giaccomo", "Pedro", "Juan", "Diego", "Alberto", "Pablo", "Manuel", "Lorenzo", "Roberto", "Adrian", "Ana", "Martina", "Diana", "Agustín", "Benjamin", "Vicente", "Martín", "Matías", "Joaquín", "Tomás", "Maximiliano", "Mateo", "Cristóbal", "Alonso", "Sebastían", "José", "Felipe", "Diego", "Lucas", "Nicolás", "Máximo", "Juan", "Bastían", "Gaspar", "Gabriel", "Renato", "Santiago", "Emilio", "Ignacio", "Francisco", "Javier", "Damián", "Bruno", "Simón", "Daniel", "Luis", "Facundo", "Franco", "Ángel", "Luciano", "Julián", "Pedro", "Pablo", "Amaro", "Fernando", "Carlos", "Cristián", "Thomas", "Esteban", "Ian", "David", "Alexander", "León", "Dante", "Rafael", "Jorge", "Gustavo", "Emiliano", "Dylan", "Rodrigo", "Víctor", "Manuel", "Camilo", "Alejandro", "Miguel", "Elías", "Álvaro", "Eduardo", "Leonardo", "Fabían", "Andrés", "Valentín", "Gonzalo", "Cristopher", "Kevin", "Isaac", "Alexis", "Samuel", "Aaron", "Clemente", "Jean", "Ricardo", "Alan", "Héctor", "Sergio", "Óscar", "Claudio", "Demian", "Patricio", "Iván", "Guillermo", "Mathías", "Marcelo", "Mauricio", "Josué", "Jesús", "Lukas", "Isaías", "César", "Axel", "Alfonso", "Alex", "Baltazar", "Sofía", "Emilia", "Florencia", "Antonella", "Martina", "Isidora", "Maite", "Josefa", "Amanda", "Agustina", "Catalina", "Antonia", "Trinidad", "Fernanda", "María", "Valentina", "Javiera", "Isabella", "Ignacia", "Constanza", "Julieta", "Francisca", "Emily", "Renata", "Mia", "Camila", "Victoria", "Matilda", "Rafaela", "Belén", "Pascal", "Monserrat", "Laura", "Magdalena", "Paz", "Anaís", "Josefina", "Pía", "Violeta", "Matilde", "Dominique", "Colomba", "Rocío", "Amalia", "Leonor", "Daniela", "Pascal", "Emma", "Amparo", "Samantha", "Gabriela", "Ámbar", "Rafaella", "Amelia", "Mayra", "Sophia", "Génesis", "Ema", "Alondra", "Mariana", "Dominga", "Mayte", "Michelle", "Rayén", "Danae", "Elena", "Lucía", "Millaray", "Paula", "Elizabeth", "Anahís", "Carolina", "Elisa", "Amy", "Bárbara", "Isabel", "Ashley", "Thiare", "Noemí", "Aylin", "Luciana", "Krishna", "Ángela", "Esperanza", "Sara", "Carla", "Noelia", "Kiara", "Katalina", "Celeste", "Montserrat", "Denisse", "Dafne", "Abigail", "Antonela", "Olivia", "Maura", "Alejandra", "Alexandra", "Consuelo"};
        String[] apellidos = new String[]{"Darigo", "Rodriguez", "Garrido", "Martines", "Rojas", "Plaza", "Toledo", "Ortiz", "Zapata", "Fierro", "Suazo", "Zuniga"};
        String exist = "";
        int nom;
        int ape;
        do {
            nom = (int) (Math.random() * (nombres.length));
            ape = (int) (Math.random() * (apellidos.length));
        } while (exist.contains(nom + "," + ape));
        exist += nom + "," + ape + " ";
        String result = nombres[nom] + " " + apellidos[ape];
        return result;
    }

    public static ArrayList generarApoderado() {
        int numero = (int) (Math.random() * 480);
        System.out.println(numero);
        ArrayList listaApoderados = new ArrayList();
        for (int i = 0; i < numero; i++) {
            listaApoderados.add(new Apoderado(generarNombre()));
        }
        return listaApoderados;
    }

    public static String asignarApoderado(ArrayList<Apoderado> lista) {
        int numero = lista.size();
        int numeroLista = (int) (Math.random() * numero);
        String result = lista.get(numeroLista).getNombre();
        return result;
    }

}
