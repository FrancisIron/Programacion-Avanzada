package generico1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class main {
    
    public static void main (String... args){
    Clase<String> c = new Clase<String>("8827");
    c.mostrarTipo();    
    HashMap<String, Integer> map = new HashMap();
    map.put("OchoOchoVeitisiete", 8827);
        System.out.println(map.values()+" "+map.get("OchoOchoVeitisiete"));
    }
}
