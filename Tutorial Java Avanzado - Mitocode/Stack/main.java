package Stack;

import java.util.Stack;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Stack<Persona> pila = new Stack<Persona>();
        pila.push(new Persona(4,"Diego",18));
        pila.push(new Persona(2,"Henry",19));
        pila.push(new Persona(2,"Henry",19));
        pila.push(new Persona(1,"Danny",18));
        
        for(Persona elemento: pila){
            System.out.println(elemento);
        }
        
        System.out.println("Tope "+pila.peek());
        System.out.println("Search "+pila.search(new Persona(1,"Danny",18)));
        
        System.out.println("LIFO");
        while(!pila.isEmpty()){
            System.out.println("Atendiendo a "+ pila.pop());
            Thread.sleep(1000);           
        }
    }
    
}
