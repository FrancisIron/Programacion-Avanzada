package Original;

import java.util.ArrayList;

/**
 *
 * @author Gamer
 */
public class Lista {
    public ArrayList<Persona> generarlista(){
        ArrayList<Persona> lista = new ArrayList();        
        lista.add(new Persona("Carlos Bernucci",18,"1111111116"));
        lista.add(new Persona("Francisco Fierro",19,"194799179916"));
        lista.add(new Persona("Javier Flores",21,"18435110212"));
        lista.add(new Persona("Eduardo Ñanculef",21,"11160815612"));
        lista.add(new Persona("Javier Vargas",15,"12568915315"));
        lista.add(new Persona("Daniel Cortes",18,"19845324514"));
        lista.add(new Persona ("Diego Garrido",21,"18453359416"));
        lista.add(new Persona ("Manuel Palma",15,"14563849616"));
        lista.add(new Persona ("Constanza Lazcano",13,"17453984216"));
        lista.add(new Persona ("Henry Zapata",15,"19456321816"));
        lista.add(new Persona ("Giaccomo Darigo",18,"14567963416"));
        return lista;
    }
}
