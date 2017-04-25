package MitoCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                     
        List<Persona> lista = new ArrayList();
        lista.add(new Persona(1,"Diego",18));
        lista.add(new Persona(2,"Danny",19));
        lista.add(new Persona(3, "Javier",21));
        
        //Collections.sort(lista);
        //Collections.reverse(lista);
        System.out.println(lista);
    }
    
}
