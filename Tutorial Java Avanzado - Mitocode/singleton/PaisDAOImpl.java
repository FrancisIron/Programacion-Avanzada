package singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class PaisDAOImpl {
    public static PaisDAOImpl instancia=null;
    
    private PaisDAOImpl(){
        
    }
    public static PaisDAOImpl getInstance(){
        if(instancia == null){
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }
    
    private static List paises = null;
    
    public List getPaises(){
        if(paises==null){
        paises= new ArrayList();
        Pais p1= new Pais("Italia");
        Pais p2= new Pais("Haiti");
        Pais p3= new Pais("Corea");
        
        paises.add(p1);
        paises.add(p2);
        paises.add(p3);
        }
        return paises;
    }
}

