package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class main {

    public static void main(String[] args) {
        Map<Persona, String> map = new HashMap<>();
        map.put(new Persona(1,"Diego",18), "Diego");
        map.put(new Persona (2,"Henry",22), "Henry");
        map.put(new Persona (2,"Henry",22), "Henry");
        map.put(new Persona (2,"Henry",22), "Henry");
        map.put(new Persona (3,"Cristian",15), "Cristian");
        map.put(new Persona (6,"Sebastian",20), "Sebastian");
        //map.put(null, "Hola");
        
        /**Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Persona key = (Persona) it.next();
            System.out.println("Clave "+ key + " -> Valor: "+map.get(key));
        }*/
        
        for(Entry<Persona, String> ent : map.entrySet()){
            System.out.println("Clave "+ ent.getKey() + " -> Valor: "+ ent.getValue());
            
        }
    }
    
}
