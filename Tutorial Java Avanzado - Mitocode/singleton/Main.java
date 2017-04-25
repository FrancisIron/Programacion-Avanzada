package singleton;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*PaisDAOImpl dao= new PaisDAOImpl();
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        
        System.out.println("******************");
        
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
        
        PaisDAOImpl daoi = new PaisDAOImpl();
        
        System.out.println("*****************");
        
        for(Object obj : daoi.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }*/
        
        //Con Singlenton correcto
        
        PaisDAOImpl dao= PaisDAOImpl.getInstance();
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }    
    }
    
}
