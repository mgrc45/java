package structures;
//Stack/Pila: Es una coleccion de elementos que cumple con la regla Last-In-First-Out(LIFO)
//El ejemplo mas clasico una pila de platos
import java.util.*;

public class stack {

    static void stackGeneric()
    {
        Stack st = new Stack();
        //Agregar elementos
        st.push(1);
        st.push(2);
        st.push(3);
        
        System.out.println("Lista original");
        for (Object element : st)
        {//Mostrar los elementos (Peek)
            System.out.print(element + " ");
        }
        System.out.println();
        
        st.pop();
        
        System.out.println("Lista secundaria");
        for (Object element : st)
        {//Mostrar los elementos (Peek)
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    static void stackEsp()
    {
        Stack<Integer> st = new Stack<Integer>();
        //Agregar elementos
        st.push(1);
        st.push(2);
        st.push(3);
        
        System.out.println("Lista original");
        for (Integer element : st)
        {//Mostrar los elementos (Peek)
            System.out.print(element + " ");
        }
        System.out.println();
        
        st.pop();
        
        System.out.println("Lista secundaria");
        for (Integer element : st)
        {//Mostrar los elementos (Peek)
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        //stackGeneric();
        stackEsp();
    }
    
}
