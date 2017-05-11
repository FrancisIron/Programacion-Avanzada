package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class main {

    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("1-Diego");
        dq.add("2-Danny");
        dq.add("3-Henry");
        dq.add(null);
        
        String x = dq.peek();
        System.out.println("Peek "+ x);
        
        x = dq.poll();
        System.out.println("Pool "+ x);
        
        x = dq.pop();
        System.out.println("Poop "+ x);
        
        dq.addFirst("0-Giaccomo");
        dq.addLast("4-Ignacio");
        
        for(String elemento : dq){
            System.out.println(elemento);
        }
    }
    
}
