package generico1;
/**
 *
 * @author R22bot2.15 Pocket
 * @param <T>
 */
public class Clase<T> {
    private T objeto;

    public Clase(T objeto) {
        this.objeto = objeto;
    }
    
    public void mostrarTipo(){
        System.out.println("T es un: "+objeto.getClass().getName());
    }
}    

