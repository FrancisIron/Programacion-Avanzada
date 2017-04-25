
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R22bot2.15 Pocket
 */
public class SesionPeliculaParsel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SesionCineSAXParser parser = new SesionCineSAXParser("test/cartelera.xml");
        Vector victor = parser.getSesionesPelicula();       
        
        SesionesPelicula usuario1 = (SesionesPelicula) victor.get(1);
        for (int i=0;i<victor.size();i++){
            SesionesPelicula usuario = (SesionesPelicula) victor.get(i);                       
            System.out.println("Pelicula n°"+(i+1)+" - "+ usuario.pelicula.titulo);
            System.out.println("Director:" + usuario.pelicula.director);
            System.out.println("Actores:"+ usuario.pelicula.actores);
            System.out.println("Codigo:" + usuario.pelicula.codigo);            
            System.out.println(" ");
        }
        
        
    
    }
}
