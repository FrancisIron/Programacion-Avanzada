package generico2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class main {

    public static void main(String[] args) {
        
        /*List<String> lista = new ArrayList();
        lista.add("8827");
        //lista.add(8827);
        
        String text = (String)lista.get(0);
        System.out.println(text);
        
        /*String[] array = new String[5];
	array[0] = "8827";
	array[1] = 1;*/
        
        Clase<String,Integer,String,Double> c = new Clase<>("OchoOchoDosSiete",8827,"Zapato",8827.0);
        c.mostrarTipo();
        
        List<Clase<String,Integer,String,String>> lista = new ArrayList<>();
	lista.add(new Clase<String,Integer,String,String>("OchoOchoDosSiete",8827,"Zapato","Galleta"));
	for(Clase<String,Integer,String,String> cl : lista){
            cl.mostrarTipo();
        }
    }
}
