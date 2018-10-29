package structures;
//Queue/Fila: Una coleccion de elementos que cumple con la regla First-In-First-Out (FIFO)
//El ejemplo mas clasico es la fila de una ventanilla de atencion.
//El que llego primero de la fila sera el primero que se ira.
import java.util.*;

public class queue {
    
    static void queueGeneric() {
        Queue q = new LinkedList();
        //Agregar datos
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println("Lista original");
        for(Object element : q)
        {
            System.out.print(element + " ");
        }
        System.out.println();
                
        q.remove();
        
        System.out.println("Lista secundaria");
        for(Object element : q)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    static void queueEsp() {
        Queue<Integer> q = new LinkedList<Integer>();
        //Agregar datos
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println("Lista original");
        for(Integer element : q)
        {
            System.out.print(element + " ");
        }
        System.out.println();
                
        q.remove();
        
        System.out.println("Lista secundaria");
        for(Integer element : q)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        //queueGeneric();
        queueEsp();
    }
    
}
