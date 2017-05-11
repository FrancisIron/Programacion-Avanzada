package Split;

public class main {

    public static void main(String[] args) {
        String cadena = "Diego|Henry|Giaccomo|Cristian";
        String[] extraccion = cadena.split("\\|",5);
        
        for(String elemento : extraccion){
            System.out.println(elemento);
        }
    }
    
}
