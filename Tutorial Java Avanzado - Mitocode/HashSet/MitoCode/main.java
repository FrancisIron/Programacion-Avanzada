package HashSet;

import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<Persona> lista = new HashSet();
        lista.add(new Persona(1,"Diego",22));
        lista.add(new Persona(1,"Giaccomo",22));
        lista.add(new Persona(1,"Henry",22));
        lista.add(new Persona(1,"Henry",22));
        lista.add(new Persona(1,"Diego",25));
        lista.add(new Persona(1,"AAA",22));
        
        for(Persona per: lista){
            System.out.println(per.getEdad()+" - "+per.getNombre());
        }
    }
    
}
