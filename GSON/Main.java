/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio;

import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona target = new Persona();
        String json = gson.toJson(target);
        System.out.println(json);
        
        Persona persona= gson.fromJson(json, Persona.class);
        System.out.println(persona.ciudad.nombre);
        
        ArrayList<Persona> array = new ArrayList<>();
        array.add(persona);
        array.add(new Persona());
        System.out.println(array.get(0).nombre);
    }
    
}
