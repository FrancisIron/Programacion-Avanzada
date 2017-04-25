package pkinstanceof;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class Main {
    private List canasta = new ArrayList();
    
    public static void main(String[] args) {
        /*String texto = new String ("8827");
        if(texto instanceof String){
            System.out.println("Es un String");
        }
    }*/
    
        /*Alumno julian = new Alumno();
        if(julian instanceof Persona){
            System.out.println("Es un Persona");
        }
    }*/
    
    //Se tiene una canasta en donde solo se debe permitir insgresar Frutas
        System.out.println("Canasta abierta, porfavor solo ingresar frutas");
        
        
        Manzana m1= new Manzana("ROJA");
        Manzana m2= new Manzana("VERDE");
        Naranja n1= new Naranja("NARANJA SIN PEPA");
        Galleta g1= new Galleta("CHOCOLATE");
        
        Main zapato = new Main();
        zapato.verificar(m1);
        zapato.verificar(m2);
        zapato.verificar(n1);
        zapato.verificar(g1);
        
    }
    private void verificar (Object objeto){
        if(objeto instanceof Fruta){
            canasta.add(objeto);
            System.out.println("Fruta agregada "+ ((Fruta) objeto).getNombre());
        }else{
            System.out.println("Elemento no permitido");            
        }
    }
}