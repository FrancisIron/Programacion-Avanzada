package generico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class main {
    //SubClase
    public void listarUpperBounded(List<? extends Persona> lista){
        for (Persona a: lista){
            //if(a instanceof Alumno){
                System.out.println(a.getNombre());
            //}else
                //}
        }
    }
    //SuperClase
    public void listarLowerBounded(List<? super Alumno> lista){
        for (Object a: lista){
            //if(a instanceof Alumno){
                System.out.println(((Persona)a).getNombre());
            //}else
                //}
        }
    }
    
     public void listarUnBounded(List<?> lista){
        for (Object a: lista){
            //if(a instanceof Alumno){
                System.out.println(((Persona)a).getNombre());
            //}else
                //}
        }
    }
        
    public static void main(String[] args) {
        main aw= new main();
        
        Persona al1= new Profesor("Diego");
        Persona al2= new Profesor("Fernando");
        Persona al3= new Profesor("Henry");
        
        List <Persona> lista= new ArrayList<>();
        lista.add(al1);
        lista.add(al2);
        lista.add(al3);
        
        aw.listarUpperBounded(lista);
        System.out.println("");
        aw.listarUnBounded(lista);
        System.out.println("");
        aw.listarLowerBounded(lista);
    }
    
}
