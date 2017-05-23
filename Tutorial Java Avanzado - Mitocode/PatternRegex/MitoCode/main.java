package PatternRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {
        String patron = "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        
        //Pattern Split
        long ini = System.currentTimeMillis();
        Pattern p = Pattern.compile(patron);
        
        for (int i = 0; i < 10000; i++) {
            String[] arreglo = p.split("Giaccomo;Henry;Diego;Daniel");
        }
        
        long fin = System.currentTimeMillis();
        
        System.out.println(fin - ini);
        
        //String Split
        
        long iniSplit = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            String[] arreglo = "Giaccomo;Henry;Diego;Daniel".split(patron);
        }
        
        long finSplit = System.currentTimeMillis();
        
        System.out.println(finSplit - iniSplit);
        
    }

}
