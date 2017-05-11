package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Queue<Persona> cola = new PriorityQueue<>();
        cola.offer(new Persona(1,"Diego",20));
        cola.offer(new Persona(2,"Danny",10));
        cola.offer(new Persona(3,"Javier",31));
        cola.offer(new Persona(4,"Cristian",27));
        cola.offer(new Persona(5,"Filomeno",42));
        
        while(!cola.isEmpty()){
            //System.out.println("Se procede a atender a "+ cola.peek());
            System.out.println("Atendiendo a "+ cola.poll());
            Thread.sleep(1000);
        }
        
    }
    
}
