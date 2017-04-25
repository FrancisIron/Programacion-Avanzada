package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                     
        List<Persona> lista = new ArrayList();
        lista.add(new Persona(1,"Diego",18));
        lista.add(new Persona(9,"Danny",19));
        lista.add(new Persona(7,"Javier",21));
        lista.add(new Persona(4,"Rosa",27));
        
        //Collections.sort(lista,new NombreComparator());
        /*Collections.sort(lista, new Comparator<Persona>(){
            @Override
            public int compare(Persona t, Persona t1) {
                int rpta= 0;
                if(t.getEdad() > t1.getEdad()){
                    rpta=1;
                }else
                    if(t.getEdad() < t1.getEdad()){
                        rpta=-1;
                    }else{
                        rpta=0;
                }
                return rpta;
            }        
        });
        */        
        //Collections.reverse(lista);        
        Collections.sort(lista);
        for(Persona p: lista){
            System.out.println(p.getEdad() + "-" +p.getNombre());            
        }
        
        //System.out.println(lista);
    }
    
}
