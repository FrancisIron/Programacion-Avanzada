
package MitoCode;

import java.util.Comparator;

/**
 * 
 * @author R22bot2.15 Pocket
 */
public class NombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona per1, Persona per2){
        //Persona per1 = (Persona)obj1;
        //Persona per2 = (Persona)obj2;
        return (per1.getNombre().compareTo(per2.getNombre()));
    }   
}
