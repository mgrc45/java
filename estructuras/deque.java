package structures;
//Deque: Es una coleccion de elementos que pueden obtenerse/agregarse por ambos extremos Primero/Ultimo
import java.util.*;

public class deque {
    
    static void deque_stack() {
        Deque<Integer> dq = new LinkedList<Integer>();
        //Agregar datos
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        
        System.out.println("Lista original");
        for(Object element : dq)
            System.out.print(element + " ");
        System.out.println();
        
        dq.removeLast();
        
        System.out.println("Lista secundaria");
        for(Object element : dq)
            System.out.print(element + " ");
        System.out.println();
    }
    
    static void deque_queue() {
        Deque<Integer> dq = new LinkedList<Integer>();
        //Agregar datos
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        
        System.out.println("Lista original");
        for(Object element : dq)
            System.out.print(element + " ");
        System.out.println();
        
        dq.removeFirst();
        
        System.out.println("Lista secundaria");
        for(Object element : dq)
            System.out.print(element + " ");
        System.out.println();
    }
    
    public static void main(String args[]) {
        deque_stack();
        //deque_queue();
    }
    
}
