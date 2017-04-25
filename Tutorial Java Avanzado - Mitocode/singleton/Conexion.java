package singleton;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class Conexion {
    private static Conexion instancia = null;
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    private Conexion(){
        
    }
}
