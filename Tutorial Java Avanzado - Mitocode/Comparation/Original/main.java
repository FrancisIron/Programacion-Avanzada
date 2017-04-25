/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Gamer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l=new Lista();
        ArrayList <Persona> lista= new ArrayList();
        lista=l.generarlista();
        System.out.println("Lista de alumnos");
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+"."+lista.get(i).getNombre());
        }
        System.out.println("------------------");
        System.out.println("Ordenando por orden alfabetico...");
        System.out.println("------------------");
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona t, Persona t1) {
                return (t.getNombre().compareTo(t1.getNombre()));        
            }       
        });
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+"."+lista.get(i).getNombre());
        }
        System.out.println("------------------");
        System.out.println("Ordenando por edad...");
        System.out.println("------------------");
        Collections.sort(lista, new Comparator<Persona>(){
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
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+"."+lista.get(i).getNombre());
        }
        System.out.println("------------------");
        System.out.println("Ordenando por RUT...");
        System.out.println("------------------");
        Collections.sort(lista, new Comparator<Persona>() {
            @Override
            public int compare(Persona t, Persona t1) {
               return t.getRut().compareTo(t1.getRut());
            }
        });
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+"."+lista.get(i).getNombre());
        }
        
    }
    
}
