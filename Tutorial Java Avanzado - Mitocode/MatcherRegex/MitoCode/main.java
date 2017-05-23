package MatcherRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {
        String texto = "Suscribete al diario Austral suscribete suscribete";
        Pattern p = Pattern.compile("suscribete", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(texto);
        
        System.out.println("matches   "+m.matches());
        
        System.out.println("lookingAt "+m.lookingAt());
        
        int cont =0;
        while(m.find()){
            cont++;
            System.out.println("Coincidencia N°" + cont + " start "+ m.start() + " end "+ m.end());
        }
    }
    
}
