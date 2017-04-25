package Original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        Lista l = new Lista();
        lista = l.generarlista();
        System.out.println("Lista de alumnos:");
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+"."+lista.get(i));
        }
        System.out.println("------------------");
        System.out.println("Ordenando...");
        System.out.println("------------------");        
        Collections.sort(lista);       
        System.out.println("Lista de alumnos:");
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+"."+lista.get(i));
        }
    }
    
}
