package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class main {

    
    public static void main(String[] args) {
        Set<Persona> lista = new TreeSet<>();
        lista.add(new Persona(1,"Diego",22));
        lista.add(new Persona(2,"Giaccomo",23));
        lista.add(new Persona(3,"Henry",24));
        lista.add(new Persona(4,"Julio",25));
        lista.add(new Persona(3,"Henry",24));
        lista.add(new Persona(6,"AAA",27));
        
        for(Persona per: lista){
            System.out.println(per.getId()+" - "+per.getNombre()+" - "+per.getEdad());
        }
    }
    
}
