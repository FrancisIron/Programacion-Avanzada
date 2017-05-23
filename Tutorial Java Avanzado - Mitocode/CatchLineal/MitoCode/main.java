package CatchLineal;

import java.io.IOException;

public class main {

    public void mostrar(){
        try{
            throw new IOException("IOException");
        }catch (NullPointerException | IOException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        main app = new main();
        app.mostrar();
    }
    
}
